package factory_method.parameter;

public class Client {
    public static void main(String[] args) {
        Creator concreteCreator = new ConcreteCreator();
        Parameter parameter = concreteCreator.createParameter("小宝");
        parameter.test();
    }
}
