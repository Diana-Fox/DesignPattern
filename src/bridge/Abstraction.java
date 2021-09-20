package bridge;

/**
 * 定义抽象接口的部分
 */
public abstract class Abstraction {
    /**
     * 持有一个实现部分的对象
     */
    protected Implementor impl;

    /**
     * 传入部分实现的对象
     *
     * @param impl
     */
    public Abstraction(Implementor impl) {
        this.impl = impl;
    }

    /**
     * 实现一定的功能，可能需要转调部分实现的具体实现方法
     */
    public void operation() {
        impl.operationImpl();
    }
}
