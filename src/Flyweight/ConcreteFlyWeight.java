package Flyweight;

/**
 * 享元对象
 */
public class ConcreteFlyWeight implements Flyweight {
    /**
     * 描述内部状态
     */
    private String intrinsicState;

    public ConcreteFlyWeight(String state) {
        this.intrinsicState = state;
    }

    @Override
    public void operation(String extrinsicState) {
        //具体的功能处理，可能会用到享元内部、外部的状态
    }
}
