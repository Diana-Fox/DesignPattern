package Flyweight;

/**
 * 享元接口，通过这个接口享元可以接受并作用于外部状态。
 */
public interface Flyweight {
    //传入外部状态
    void operation(String extrinsicState);
}
