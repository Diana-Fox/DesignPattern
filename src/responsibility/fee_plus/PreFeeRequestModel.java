package responsibility.fee_plus;

public class PreFeeRequestModel extends RequestModel {
    public final static String FEE_TYPE = "preFee";

    public PreFeeRequestModel() {
        super(FEE_TYPE);
    }

    private String user;
    private double fee;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
