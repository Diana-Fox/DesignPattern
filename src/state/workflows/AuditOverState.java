package state.workflows;

public class AuditOverState implements State {
    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        //处理具体业务即可
    }
}
