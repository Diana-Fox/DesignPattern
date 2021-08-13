package factory_method;

public class Client {
    public static void main(String[] args) {
        //理论上有多个子类，分别对应不同实现的Product,想用哪个就创建对应的子类,子类只选择
        Creator concreteCreator = new ConcreteCreator();
        concreteCreator.someOperation();
    }
}
