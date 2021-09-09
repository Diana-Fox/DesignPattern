package memento.storage_recovery;

public abstract class AbstractCommand implements Command {
    public abstract void execute();

    protected OperationApi operation;

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    @Override
    public Memento createMemento() {
        return operation.createMemento();
    }

    @Override
    public void redo(Memento memento) {
        operation.setMemento(memento);
    }

    @Override
    public void undo(Memento memento) {
        operation.setMemento(memento);
    }

}
