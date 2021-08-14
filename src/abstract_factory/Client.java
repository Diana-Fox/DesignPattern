package abstract_factory;

public class Client {
    public static void main(String[] args) {
        //每个工厂创建的一系列对象是相匹配的
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        AbstractProductA productA = concreteFactory1.createProductA();
        productA.printClassName();
        AbstractProductB productB = concreteFactory1.createProductB();
        productB.printClassName();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        AbstractProductA productA1 = concreteFactory2.createProductA();
        productA1.printClassName();
        AbstractProductB productB1 = concreteFactory2.createProductB();
        productB1.printClassName();
    }
}
