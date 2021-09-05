package strategy.strategy_template;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class LogStrategyTemplate implements LogStrategy {
    /**
     * 定义日志步骤
     *
     * @param msg
     */
    @Override
    public final void log(String msg) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        msg = df.format(new Date()) + "内容是：" + msg;
        doLog(msg);
    }

    /**
     * 具体要实现的记录步骤
     *
     * @param msg
     */
    protected abstract void doLog(String msg);
}
