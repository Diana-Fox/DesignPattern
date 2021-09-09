package memento.to_prototype;


/**
 * 负责保存模拟运行流程A的对象的备忘录对象
 */
public class FlowAMementoCareTaker {
    private FlowAMockMemento memento;

    public FlowAMockMemento retrieveMemento() {
        return memento;
    }

    public void saveMemento(FlowAMockMemento memento) {
        this.memento = memento;
    }
}
