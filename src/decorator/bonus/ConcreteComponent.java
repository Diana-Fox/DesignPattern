package decorator.bonus;

import java.util.Date;

/**
 * 计算奖金的类，被装饰的对象
 */
public class ConcreteComponent extends Component {
    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //默认缺省实现
        return 0;
    }
}
