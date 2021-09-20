package decorator.bonus;

public class Client {
    public static void main(String[] args) {
        //被装饰对象
        ConcreteComponent c1 = new ConcreteComponent();

        MonthPrizeDecorator d1 = new MonthPrizeDecorator(c1);
        SumPrizeDecorator d2 = new SumPrizeDecorator(d1);
        double xb = d2.calcPrize("小宝", null, null);
        System.out.println("小宝应得奖金" + xb);
        double bb = d2.calcPrize("宝宝", null, null);
        System.out.println("宝宝应得奖金" + bb);
        GroupPrizeDecorator d3 = new GroupPrizeDecorator(d2);
        double ber = d3.calcPrize("宝儿", null, null);
        System.out.println("宝儿经理应得奖金" + ber);
    }
}
