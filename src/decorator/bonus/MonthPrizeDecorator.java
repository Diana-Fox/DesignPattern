package decorator.bonus;

import java.util.Date;

/**
 * 装饰器对象，计算当月业务奖金
 */
public class MonthPrizeDecorator extends Decorator {
    public MonthPrizeDecorator(Component component) {
        super(component);
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        double prize = TempDB.mapMonthSaleMoney.get(user) * 0.03;
        System.out.println(user + "当月业务奖金" + prize);
        return money + prize;
    }
}
