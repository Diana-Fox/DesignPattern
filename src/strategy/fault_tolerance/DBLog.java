package strategy.fault_tolerance;

/**
 * 记录到数据库
 */
public class DBLog implements LogStrategy {
    @Override
    public void log(String msg) {
        if (msg != null && msg.trim().length() > 5) {
            //这里准备动态控制一个错误，要是字符串长度大于5就会异常
            int a = 5 / 0;
        }
        System.out.println("现在把'" + msg + "'记录到数据库中");
    }
}
