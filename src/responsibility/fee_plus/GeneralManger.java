package responsibility.fee_plus;

public class GeneralManger extends Handler {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (FeeRequestModel.FEE_TYPE.equals(rm.getType())) {
            return handleFeeRequest(rm);
        } else {
            return super.handleRequest(rm);
        }
    }

    private Object handleFeeRequest(RequestModel rm) {
        FeeRequestModel frm = (FeeRequestModel) rm;
        String str = "";
        if (frm.getFee() >= 1000) {
            if ("小宝".equals(frm.getUser())) {
                str = "总经理同意" + frm.getUser() + "聚餐费用" + frm.getFee() + "元的请求";
            } else {
                str = "总经理不同意" + frm.getUser() + "聚餐费用" + frm.getFee() + "元的请求";
            }
        } else {
            if (successor != null)
                return successor.handleRequest(rm);
        }
        return str;
    }
}
