package responsibility.fee_plus;

//表示具体的业务类型
public class RequestModel {
    private String type;

    public RequestModel(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
