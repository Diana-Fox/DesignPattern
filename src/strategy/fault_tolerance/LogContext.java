package strategy.fault_tolerance;

public class LogContext {
    public void log(String msg) {
        //新策略是上下文中自己选择策略了
        LogStrategy strategy = new DBLog();
        try {
            strategy.log(msg);
        } catch (Exception e) {
            //写数据库出问题就往文件里面写
            strategy = new FileLog();
            strategy.log(msg);
        }

    }
}
