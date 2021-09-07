package state.workflows;

/**
 * 公共状态处理机，相当于状态模式的Context
 * 包含所有流出使用状态模式时的公共功能
 */
public class StateMachine {
    //持有一个状态对象
    private State state;
    //流程处理需要的业务数据对象，不知道具体类型
    private Object businessVO;
    public void doWork(){
        //转调状态对象完成功能处理
        state.doWork(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Object getBusinessVO() {
        return businessVO;
    }

    public void setBusinessVO(Object businessVO) {
        this.businessVO = businessVO;
    }
}
