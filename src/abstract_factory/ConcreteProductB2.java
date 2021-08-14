package abstract_factory;

/**
 * 具体产品对象，通常在具体工厂里面，会选择具体的产品实现对象，来创建符合抽象工厂定义的方法返回的产品类型的对象
 */
public class ConcreteProductB2 implements AbstractProductB {
    @Override
    public void printClassName() {
        System.out.println("ConcreteProductB2");
    }
}
