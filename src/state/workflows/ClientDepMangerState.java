package state.workflows;

import java.util.Scanner;

/**
 * 测试专用的部门经理审批
 */
public class ClientDepMangerState implements State {
    @Override
    public void doWork(StateMachine request) {
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println("部门经理审核中，请稍候......");
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays() + "天，" +
                "请部门经理审核（1为同意，2为不同意）");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String result = "不同意";
            if (a == 1) {
                result = "同意";
            }
            lrm.setResult("部门经理审核结果" + result);
            request.setState(new AuditOverState());
            request.doWork();
        }
    }
}
