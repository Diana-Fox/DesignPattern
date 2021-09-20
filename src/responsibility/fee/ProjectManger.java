package responsibility.fee;


public class ProjectManger extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee < 500) {
            if ("小宝".equals(user)) {
                str = "项目经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "项目经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
        } else {
            if (successor != null)
                return successor.handleFeeRequest(user, fee);
        }
        return str;
    }
}
