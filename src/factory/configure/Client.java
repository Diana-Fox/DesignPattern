package factory.configure;

public class Client {
    public static void main(String[] args) {
        Api api1 = Factory.createApi();
        api1.operation("正在使用简单工厂");
        Api api2 = Factory.createApi();
        api2.operation("正在使用简单工厂");
    }
}
