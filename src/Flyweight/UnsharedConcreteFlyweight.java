package Flyweight;

/**
 * 不需要共享的Flyweight
 * 通常是将共享的享元对象作为子节点，组合出来的对象
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    /**
     * 描述对象的状态
     */
    private String allState;

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理
    }
}
