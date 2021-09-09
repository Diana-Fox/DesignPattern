package memento.flow_mock;

/**
 * 负责保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoCareTaker {
    private FlowMockMemento memento;

    public FlowMockMemento retrieveMemento() {
        return memento;
    }

    public void saveMemento(FlowMockMemento memento) {
        this.memento = memento;
    }
}
