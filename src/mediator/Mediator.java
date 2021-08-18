package mediator;

/**
 * 中介者接口，定义各个同事之间交互需要的方法
 */
public interface Mediator {
    /**
     * 同事对象在自身改变时通知中介者方法
     * 让中介者去负责相应的与其他同事对象的交互
     * @param colleague 同事对象自身，好让中介者对象通过实例去获取同事对象的状态
     */
    void changed(Colleague colleague);
}
