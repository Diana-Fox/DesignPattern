package Flyweight.unshared;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityManger {
    private static SecurityManger securityManger = new SecurityManger();

    public SecurityManger() {

    }

    public static SecurityManger getInstance() {
        return securityManger;
    }

    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }


    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> flyweights = map.get(user);
        System.out.println("现在测试" + securityEntity + "的" + permit + "权限，map.size=" + map.size());
        if (flyweights == null || flyweights.size() == 0) {
            System.out.println(user + "没有登录或者没有被分配任何权限");
            return false;
        }
        for (Flyweight fm :
                flyweights) {
            System.out.println("fm==" + fm);
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    //模拟查找数据库
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s :
                TestDB.colDB) {
            String[] split = s.split(",");
            if (split[0].equals(user)) {
                Flyweight fm = null;
                if (split[3].equals("2")) {
                    //表示是组合
                    fm = new UnsharedConcreteFlyweight();
                    String[] temps = TestDB.mapDB.get(split[1]);
                    for (String temp : temps) {
                        Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(temp);
                        fm.add(flyweight);
                    }
                } else {
                    fm = FlyweightFactory.getInstance().getFlyweight(split[1] + "," + split[2]);
                }
                col.add(fm);
            }
        }
        return col;
    }
}
