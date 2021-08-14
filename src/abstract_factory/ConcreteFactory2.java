package abstract_factory;

/**
 * 具体的工厂，实现抽象工厂定义的方法，具体实现一系列产品对象的创建
 */
public class ConcreteFactory2 implements AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}
