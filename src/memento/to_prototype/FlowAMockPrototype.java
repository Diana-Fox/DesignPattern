package memento.to_prototype;


import memento.flow_mock.FlowMockMemento;

public class FlowAMockPrototype implements Cloneable {
    private String flowName;
    private int tempResult;
    private String tempState;

    public FlowAMockPrototype(String flowName) {
        this.flowName = flowName;
    }


    //示意运行流程的第一阶段
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
    public FlowAMockMemento createMemento() {
        try {
            MementoImplPrototype prototype = new MementoImplPrototype((FlowAMockPrototype) this.clone());
            return prototype;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void setMemento(FlowAMockMemento memento) {
        MementoImplPrototype mementoImpl = (MementoImplPrototype) memento;
        this.tempResult = mementoImpl.getFlowAMock().tempResult;
        this.tempState = mementoImpl.getFlowAMock().tempState;
    }

    //内部类
    private static class MementoImplPrototype implements FlowAMockMemento {
        private FlowAMockPrototype flowAMock;

        public MementoImplPrototype(FlowAMockPrototype flowAMock) {
            this.flowAMock = flowAMock;
        }

        public FlowAMockPrototype getFlowAMock() {
            return flowAMock;
        }
    }


}
