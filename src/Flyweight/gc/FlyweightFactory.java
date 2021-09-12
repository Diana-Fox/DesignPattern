package Flyweight.gc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 享元工厂，通常实例称为单例
 * 加入实现垃圾回收和引用计数的功能
 */
public class FlyweightFactory {
    private static FlyweightFactory factory = new FlyweightFactory();

    public FlyweightFactory() {
        Thread cleanCache = new CleanCache();
        cleanCache.start();
    }

    public static FlyweightFactory getInstance() {
        return factory;
    }

    //缓存多个Flyweight对象
    private Map<String, Flyweight> fsMap = new HashMap<>();

    //用来缓存被共享对象的缓存配置
    private Map<String, CacheConfModel> cacheConfModelMap = new HashMap<>();

    private Map<String, Integer> countMap = new HashMap<>();

    //默认保存6s
    private final long DURABLE_TIME = 6 * 1000l;

    //获取某个享元被使用的次数
    public synchronized int getUseTimes(String key) {
        Integer count = countMap.get(key);
        if (count == null) {
            count = 0;
        }
        return count;
    }

    public synchronized Flyweight getFlyweight(String key) {
        Flyweight flyweight = fsMap.get(key);
        if (flyweight == null) {
            flyweight = new AuthorizationFlyweight(key);
            fsMap.put(key, flyweight);
            countMap.put(key, 1);
            CacheConfModel cm = new CacheConfModel();
            cm.setBeginTime(System.currentTimeMillis());
            cm.setForever(false);
            cm.setDurableTime(DURABLE_TIME);

            cacheConfModelMap.put(key, cm);
        } else {
            CacheConfModel cm = cacheConfModelMap.get(key);
            cm.setBeginTime(System.currentTimeMillis());
            this.cacheConfModelMap.put(key, cm);
            Integer count = countMap.get(key);
            countMap.put(key, ++count);
        }
        return flyweight;
    }

    //删除享元
    private synchronized void removeFlyweight(String key) {
        this.fsMap.remove(key);
        this.cacheConfModelMap.remove(key);
        this.countMap.remove(key);
    }

    private class CleanCache extends Thread {
        @Override
        public void run() {
            while (true) {
                Set<String> tempSet = new HashSet<>();
                Set<String> set = cacheConfModelMap.keySet();
                for (String key :
                        set) {
                    CacheConfModel ccm = cacheConfModelMap.get(key);
                    if ((System.currentTimeMillis() - ccm.getBeginTime()) >= ccm.getDurableTime()) {
                        //可以清除，标记下来
                        tempSet.add(key);
                    }
                }
                for (String key : tempSet) {
                    //正式清理
                    FlyweightFactory.getInstance().removeFlyweight(key);
                }
                System.out.println("now thread=" + fsMap.size() + ",fsMap==" + fsMap.keySet());
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
