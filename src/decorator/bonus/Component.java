package decorator.bonus;

import java.util.Date;

public abstract class Component {
    /**
     * 有些参数演示不用，实际业务会用，所以保留
     *
     * @param user
     * @param begin
     * @param end
     * @return
     */
    public abstract double calcPrize(String user, Date begin, Date end);
}
