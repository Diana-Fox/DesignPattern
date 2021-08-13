package factory_method.parts;

/**
 * 创建器，声明工厂方法
 */
public abstract class Creator {
    //作为Creator类的部件
    protected abstract ConcreteProduct1 factoryMethod1();

    protected abstract ConcreteProduct2 factoryMethod2();

    public Product createProduct() {
        ConcreteProduct1 concreteProduct1 = factoryMethod1();
        ConcreteProduct2 concreteProduct2 = factoryMethod2();
        Product concreteProduct = new ConcreteProduct();
        concreteProduct.setProduct1(concreteProduct1);
        concreteProduct.setProduct2(concreteProduct2);
        return concreteProduct;
    }
}
