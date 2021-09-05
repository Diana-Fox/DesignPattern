package strategy.fault_tolerance;

public class Client {
    public static void main(String[] args) {
        LogContext  cxt = new LogContext();
        cxt.log("测试呀！");
        cxt.log("这次多记录点信息");
    }
}
