package state.workflows;

/**
 * 项目经理审批
 */
public class ProjectMangerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        //业务处理，把审核结果保存到数据库中

        if ("同意".equals(lrm.getResult())) {
            if (lrm.getLeaveDays() > 3) {
                //请假天数大于三天，且项目经理同意，提交部门经理
                request.setState(new DepMangerState());
            } else {
                //三天内项目经理同意即可
                request.setState(new AuditOverState());
            }
        } else {
            request.setState(new AuditOverState());
        }
    }
}
