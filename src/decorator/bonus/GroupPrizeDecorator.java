package decorator.bonus;

import java.util.Date;

/**
 * 装饰器对象，计算团队奖金
 */
public class GroupPrizeDecorator extends Decorator {
    public GroupPrizeDecorator(Component component) {
        super(component);
    }


    @Override
    public double calcPrize(String user, Date begin, Date end) {
        double money = super.calcPrize(user, begin, end);
        //假设累计金额都为1000000
        double group = 0.0;
        for (double d : TempDB.mapMonthSaleMoney.values()) {
            group += d;
        }
        double prize = group * 0.01;
        System.out.println(user + "当月团队业务奖金" + prize);
        return money + prize;
    }
}
