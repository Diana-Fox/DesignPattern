package memento;

//原发器
public class Originator {
    private String state;

    public Memento createMemento() {
        return new MementoImpl(state);
    }

    public void setMemento(Memento memento) {
        MementoImpl mementoImpl = (MementoImpl) memento;
        this.state = mementoImpl.getState();
    }

    /**
     * 真正的备忘录对象，实现备忘录窄接口
     * 只有Originator才可以访问到
     */
    private static class MementoImpl implements Memento {
        //需要保存的对象，如果是引用模式，对象需要进行克隆
        private String state;

        public MementoImpl(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }
    }
}
