package state.workflows;

import java.util.Scanner;

//因为涉及到很多数据库内容，模拟太麻烦了，用这个类模拟业务
public class ClientProjectMangerState implements LeaveRequestState {
    @Override
    public void doWork(StateMachine request) {
        //先把业务对象造型回来
        LeaveRequestModel lrm = (LeaveRequestModel) request.getBusinessVO();
        System.out.println("项目经理审核中");
        System.out.println(lrm.getUser() + "申请从" + lrm.getBeginDate() + "开始请假" + lrm.getLeaveDays() + "天，" +
                "请项目经理审核（1为同意，2为不同意）");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            int a = scanner.nextInt();
            String result = "不同意";
            if (a == 1) {
                result = "同意";
            }
            lrm.setResult("项目经理审核结果" + result);
            if (a == 1) {
                if (lrm.getLeaveDays() > 3) {
                    //如果请假天数大于3天，项目经理同意了，交给部门经理
                    request.setState(new ClientDepMangerState());
                    //继续执行下一步工作
                    request.doWork();
                }else{
                    request.setState(new AuditOverState());
                    request.doWork();
                }
            }
        }
    }
}
