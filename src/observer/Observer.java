package observer;


/**
 * 观察者接口
 */
public interface Observer {
    /**
     * 更新接口
     *
     * @param subject 传入目标对象，好获取相应的目标对象的状态
     */
    void update(Subject subject);
}
