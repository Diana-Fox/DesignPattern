package responsibility.fee_plus;

public abstract class Handler {
    //下一个处理请求的对象
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 通用的请求处理方法
     *
     * @return
     */
    public Object handleRequest(RequestModel requestModel) {
        if (successor != null) {
            return successor.handleRequest(requestModel);
        } else {
            System.out.println("没有后续处理或者暂时不支持这样的功能处理");
            return false;
        }
    }
}
