package factory.simple;

public class Client {
    public static void main(String[] args) {
        Api api1 = Factory.createApi(1);
        api1.operation("正在使用简单工厂");
        Api api2 = Factory.createApi(2);
        api2.operation("正在使用简单工厂");
    }
}
