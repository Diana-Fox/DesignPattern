package state.workflows;

/**
 * 部门经理
 */
public class DepMangerState implements State {
    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        //部门经理审核业务
        //部门经理审核处理后，审核结束
        request.setState(new AuditOverState());
    }
}
