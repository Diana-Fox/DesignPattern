package strategy.pay;

public class Client {
    public static void main(String[] args) {
        RMBCash rmbCash = new RMBCash();
        DollarCash dollarCash = new DollarCash();
        PaymentContext ctx1 = new PaymentContext("小宝", 1000, rmbCash);
        ctx1.payNow();
        PaymentContext ctx2 = new PaymentContext("宝儿", 800, dollarCash);
        ctx2.payNow();
    }
}
