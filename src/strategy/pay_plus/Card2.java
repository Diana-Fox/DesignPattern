package strategy.pay_plus;

public class Card2 implements PaymentStrategy {
    private String account;

    public Card2(String account) {
        this.account = account;
    }

    @Override
    public void pay(PaymentContext ctx) {
        System.out.println("现在给" + ctx.getUserName() + "的" + this.account +
                "账号支付了" + ctx.getMoney() + "元");
    }
}
