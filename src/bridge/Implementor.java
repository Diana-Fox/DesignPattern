package bridge;

/**
 * 定义实现部分的接口，可以与抽象部分接口的方法不一样
 */
public interface Implementor {
    /**
     * 实现抽象部分相应的某些具体功能
     */
    void operationImpl();
}
