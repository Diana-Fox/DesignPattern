package memento.flow_mock;

import memento.Memento;

public class FlowMock {
    //流程名称
    private String flowName;
    //流程结果，需要存储
    private int tempResult;
    //流程状态，需要存储
    private String tempState;

    public FlowMock(String flowName) {
        this.flowName = flowName;
    }

    public void runPhaseOne() {
        tempResult = 3;
        tempState = "PhaseOne";
    }

    /**
     * 示意按照方案一来运行流程后半部分
     */
    public void schema1() {
        tempState += ",Schema1";
        System.out.println(tempState + "now run " + tempResult);
        tempResult += 11;
    }

    /**
     * 示意按照方案二来运行流程后半部分
     */
    public void schema2() {
        tempState += ",Schema2";
        System.out.println(tempState + "now run " + tempResult);
        tempResult += 22;
    }

    public FlowMockMemento createMemento() {
        return new FlowMockMementoImpl(tempResult, tempState);
    }

    public void setMemento(FlowMockMemento memento) {
        FlowMockMementoImpl mementoImpl = (FlowMockMementoImpl) memento;
        tempResult=mementoImpl.getTempResult();
        tempState=mementoImpl.getTempState();
    }

    //内部类
    private static class FlowMockMementoImpl implements FlowMockMemento {
        //流程结果
        private int tempResult;
        //流程状态
        private String tempState;

        public FlowMockMementoImpl(int tempResult, String tempState) {
            this.tempResult = tempResult;
            this.tempState = tempState;
        }

        public int getTempResult() {
            return tempResult;
        }

        public void setTempResult(int tempResult) {
            this.tempResult = tempResult;
        }

        public String getTempState() {
            return tempState;
        }

        public void setTempState(String tempState) {
            this.tempState = tempState;
        }
    }
}
