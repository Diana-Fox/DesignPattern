package Flyweight.authority;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    /**
     * 享元工厂，通常实现为单例
     */
    private static FlyweightFactory factory = new FlyweightFactory();

    private FlyweightFactory() {
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    /**
     * 缓存多个享元对象
     */
    private Map<String, Flyweight> fsMap = new HashMap<>();

    /**
     * 获取享元对象
     *
     * @param key
     * @return
     */
    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = fsMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            fsMap.put(key, flyweight);
        }
        return flyweight;
    }

}
