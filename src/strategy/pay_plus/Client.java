package strategy.pay_plus;

public class Client {
    public static void main(String[] args) {

        Card card = new Card();
        PaymentContext2 cxt2 = new PaymentContext2("宝宝", 10000, card, "12345678987654321");
        cxt2.payNow();

        Card2 card2 = new Card2("123456789876");
        PaymentContext cxt = new PaymentContext("小宝", 100000, card2);
        cxt.payNow();
    }
}
