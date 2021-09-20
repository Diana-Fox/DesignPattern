package responsibility.fee_plus;

public class GeneralManger2 extends GeneralManger {
    @Override
    public Object handleRequest(RequestModel rm) {
        if (PreFeeRequestModel.FEE_TYPE.equals(rm.getType())) {
            return myHandler(rm);
        } else {
            return super.handleRequest(rm);
        }
    }

    private Object myHandler(RequestModel rm) {
        PreFeeRequestModel pfrm = (PreFeeRequestModel) rm;
        if (pfrm.getFee() > 20000 ) {
            System.out.println("总经理同意" + pfrm.getUser() +
                    "预支差旅费用" + pfrm.getFee() + "元的请求");
            return true;
        } else {
            if (successor != null) {
                return successor.handleRequest(rm);
            }
        }
        return false;
    }
}
