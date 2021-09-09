package memento.storage_recovery;

/**
 * 操作接口
 */
public interface OperationApi {
    int getResult();

    void add(int num);

    void substract(int num);

    Memento createMemento();

    void setMemento(Memento memento);
}
