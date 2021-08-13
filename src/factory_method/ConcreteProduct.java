package factory_method;

/**
 * Product的实现
 */
public class ConcreteProduct implements Product {
    @Override
    public void myProduct() {
        System.out.println("调用一下接口方法");
    }
}
