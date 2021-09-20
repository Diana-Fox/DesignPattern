package responsibility.fee;

/**
 * 总经理
 */
public class GeneralManger extends Handler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if (fee >= 1000) {
            if ("小宝".equals(user)) {
                str = "总经理同意" + user + "聚餐费用" + fee + "元的请求";
            } else {
                str = "总经理不同意" + user + "聚餐费用" + fee + "元的请求";
            }
        } else {
            if (successor != null)
                return successor.handleFeeRequest(user, fee);
        }
        return str;
    }
}
