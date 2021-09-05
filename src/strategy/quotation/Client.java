package strategy.quotation;

public class Client {
    public static void main(String[] args) {
        Strategy ncs = new OldCustomerStrategy();
        Price price = new Price(ncs);
        double quote = price.quote(1000);
        System.out.println("向客户报价"+quote);
    }
}
