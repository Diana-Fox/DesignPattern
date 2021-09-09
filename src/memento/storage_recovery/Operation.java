package memento.storage_recovery;

/**
 * 运算类
 */
public class Operation implements OperationApi {
    //运算结果
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void add(int num) {
        result += num;
    }

    @Override
    public void substract(int num) {
        result -= num;
    }

    @Override
    public Memento createMemento() {
        return new MementoImp(result);
    }

    @Override
    public void setMemento(Memento memento) {
        MementoImp mementoImp = (MementoImp) memento;
        result = mementoImp.getResult();
    }

    private class MementoImp implements Memento {
        private int result;

        public MementoImp(int result) {
            this.result = result;
        }

        public int getResult() {
            return result;
        }
    }
}
