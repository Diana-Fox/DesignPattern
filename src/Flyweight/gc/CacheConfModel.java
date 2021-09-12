package Flyweight.gc;

/**
 * 描述享元对象缓存的配置对象
 */
public class CacheConfModel {
    //缓存开始时间
    private long beginTime;
    //最长不被使用时间
    private double durableTime;
    //缓存对象永久存储，不被删除
    private boolean forever;

    public boolean isForever() {
        return forever;
    }

    public void setForever(boolean forever) {
        this.forever = forever;
    }

    public long getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(long beginTime) {
        this.beginTime = beginTime;
    }

    public double getDurableTime() {
        return durableTime;
    }

    public void setDurableTime(double durableTime) {
        this.durableTime = durableTime;
    }
}
