package memento.storage_recovery;

public class AddCommand extends AbstractCommand{
    private int openNum;

    public AddCommand(int openNum) {
        this.openNum = openNum;
    }

    @Override
    public void execute() {
        operation.add(openNum);
    }
}
