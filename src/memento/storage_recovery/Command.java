package memento.storage_recovery;

/**
 * 命令接口
 */
public interface Command {
    void execute();

    void undo(Memento memento);

    void redo(Memento memento);

    Memento createMemento();

}
