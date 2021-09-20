package decorator.bonus;

import java.util.Date;

public class Decorator extends Component {
    /**
     * 被装饰对象
     */
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public double calcPrize(String user, Date begin, Date end) {
        //调转组件对象的方法
        return component.calcPrize(user, begin, end);
    }
}
