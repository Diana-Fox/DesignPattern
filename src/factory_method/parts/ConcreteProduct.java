package factory_method.parts;

/**
 * Product的实现
 */
public class ConcreteProduct implements Product {
    //拥有ConcreteProduct1和ConcreteProduct2两个部件
    private ConcreteProduct1 concreteProduct1;
    private ConcreteProduct2 concreteProduct2;

    @Override
    public void setProduct1(ConcreteProduct1 concreteProduct1) {
        this.concreteProduct1 = concreteProduct1;
    }

    @Override
    public void setProduct2(ConcreteProduct2 concreteProduct2) {
        this.concreteProduct2 = concreteProduct2;
    }
}
