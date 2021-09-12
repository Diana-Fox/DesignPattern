package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    //缓存多个flyweight对象
    private Map<String, Flyweight> fsMap = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyWeight = fsMap.get(key);
        if (flyWeight == null) {
            //创建一个新的享元
            flyWeight = new ConcreteFlyWeight(key);
            fsMap.put(key, flyWeight);
        }
        return flyWeight;
    }


}
