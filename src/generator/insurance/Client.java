package generator.insurance;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder builder =
                new ConcreteBuilder("001", 123l, 234l);
        InsuranceContract contract = builder.setPersonName("张三").setOtherDate("测试").build();
        contract.someOperation();
    }
}
