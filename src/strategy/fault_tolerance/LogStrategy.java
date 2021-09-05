package strategy.fault_tolerance;

/**
 * 日志策略接口
 */
public interface LogStrategy {
    //记录日志
    void log(String msg);

}
