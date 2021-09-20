package decorator.bonus;

import java.util.Date;

/**
 * 装饰器对象，计算累计奖金
 */
public class SumPrizeDecorator extends Decorator {
    public SumPrizeDecorator(Component component) {
        super(component);
    }


    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        //假设累计金额都为1000000
        double prize = 1000000 * 0.001;
        System.out.println(user + "累计奖金" + prize);
        return money + prize;
    }
}
