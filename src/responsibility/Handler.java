package responsibility;

/**
 * 职责接口，也就是处理请求的接口
 */
public abstract class Handler {
    /**
     * 持有后继的职责对象
     */
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 示意处理请求的方法，虽然这个示意方法是没有传入参数。
     * 实际可以根据需要确定是否要传参
     */
    public abstract void handleRequest();
}
