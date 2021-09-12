package Flyweight.gc;


import java.util.ArrayList;
import java.util.Collection;

public class SecurityManger {
    private static SecurityManger securityManger = new SecurityManger();

    private SecurityManger() {
    }

    public static SecurityManger getInstance() {
        return securityManger;
    }

    public boolean hasPermit(String user, String securityEntity, String permit) {
        //每次都数据库查询
        Collection<Flyweight> col = this.queryByUser(user);
        if (col == null || col.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight fm :
                col) {
            if (fm.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] split = s.split(",");
            if (split[0].equals(user)) {
                Flyweight fm = null;
                if (split[3].equals("2")) {
                    fm = new UnsharedConcreteFlyweight();
                    //需要组合的数据
                    String[] temps = TestDB.mapDB.get(split[1]);
                    for (String temp :
                            temps) {
                        Flyweight tempFm = FlyweightFactory.getInstance().getFlyweight(temp);
                        fm.add(tempFm);
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
