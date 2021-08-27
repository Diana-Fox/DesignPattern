package command.counter;

public class AddCommand implements Command {
    //持有具体执行计算的对象
    private OperationApi operation;
    //操作的数据
    private int opeNum;

    public AddCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        this.operation.add(opeNum);
    }

    @Override
    public void undo() {
        this.operation.substract(opeNum);
    }
}
