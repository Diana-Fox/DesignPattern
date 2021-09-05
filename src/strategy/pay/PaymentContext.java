package strategy.pay;

public class PaymentContext {
    private String userName;

    private double money;

    private PaymentStrategy strategy;

    public PaymentContext(String userName, double money, PaymentStrategy strategy) {
        this.userName = userName;
        this.money = money;
        this.strategy = strategy;
    }

    public String getUserName() {
        return userName;
    }

    public void payNow() {
        this.strategy.pay(this);
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
