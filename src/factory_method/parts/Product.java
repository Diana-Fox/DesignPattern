package factory_method.parts;

/**
 * 定义工厂方法所创建的对象的接口，
 * 也就是实际需要使用的对象的接口
 */
public interface Product {
    void setProduct1(ConcreteProduct1 concreteProduct1);

    void setProduct2(ConcreteProduct2 concreteProduct2);
}
