package state.workflows;

public class Client {
    public static void main(String[] args) {
        LeaveRequestModel lrm = new LeaveRequestModel();
        lrm.setUser("小宝");
        lrm.setBeginDate("2021-9-8");
        lrm.setLeaveDays(5);
        LeaveRequestContext request = new LeaveRequestContext();
        request.setBusinessVO(lrm);
        request.setState(new ClientProjectMangerState());
        request.doWork();
    }
}
