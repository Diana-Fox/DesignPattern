package observer.publish_subscribe;

/**
 * 观察者
 */
public interface Observer {
    //通知方法
    void update(Subject subject);
}
