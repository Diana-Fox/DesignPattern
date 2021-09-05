package strategy.pay_plus;

public class DollarCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "美元支付" + ctx.getMoney());
    }
}
