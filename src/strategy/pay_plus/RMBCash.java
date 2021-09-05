package strategy.pay_plus;

public class RMBCash implements PaymentStrategy {
    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" +  ctx.getUserName() + "人民币支付" + ctx.getMoney());
    }
}
