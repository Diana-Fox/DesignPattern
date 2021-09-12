package Flyweight.authority;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SecurityManger {
    private static SecurityManger securityManger = new SecurityManger();

    private SecurityManger() {
    }

    public static SecurityManger getInstance() {
        return securityManger;
    }

    private Map<String, Collection<Flyweight>> map = new HashMap<>();

    public void login(String user) {
        Collection<Flyweight> col = queryByUser(user);
        map.put(user, col);
    }

    /**
     * 判断某个用户对某个安全实体是否拥有某权限
     *
     * @param user
     * @param securityEntity
     * @param permit
     * @return
     */
    public boolean hasPermit(String user, String securityEntity, String permit) {
        Collection<Flyweight> flyweights = map.get(user);
        if (flyweights == null || flyweights.size() == 0) {
            System.out.println(user + "没有登录或是没有被分配任何权限");
            return false;
        }
        for (Flyweight flyweight : flyweights) {
            System.out.println("flyweight==" + flyweight);
            if (flyweight.match(securityEntity, permit)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 从数据库中获取某人所拥有的权限
     *
     * @param user
     * @return
     */
    private Collection<Flyweight> queryByUser(String user) {
        Collection<Flyweight> col = new ArrayList<>();
        for (String s : TestDB.colDB) {
            String[] split = s.split(",");
            if (split[0].equals(user)) {
                Flyweight flyweight = FlyweightFactory.getInstance().getFlyweight(split[1] + "," + split[2]);
                col.add(flyweight);
            }
        }
        return col;
    }
}
