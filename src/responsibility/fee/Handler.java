package responsibility.fee;

public abstract class Handler {
    protected Handler successor = null;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 聚餐费用申请
     *
     * @param user 申请人
     * @param fee  申请金额
     * @return 申请结果
     */
    public abstract String handleFeeRequest(String user, double fee);
}
