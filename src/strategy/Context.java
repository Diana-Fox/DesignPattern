package strategy;

/**
 * 上下文对象
 */
public class Context {
    //持有具体的策略对象
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.algorithmInterface();
    }
}
