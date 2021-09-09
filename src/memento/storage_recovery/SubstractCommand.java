package memento.storage_recovery;

public class SubstractCommand extends AbstractCommand{
    private int openNum;

    public SubstractCommand(int openNum) {
        this.openNum = openNum;
    }

    @Override
    public void execute() {
        operation.substract(openNum);
    }
}
