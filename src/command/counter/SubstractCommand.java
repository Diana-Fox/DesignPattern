package command.counter;

public class SubstractCommand implements Command {
    //持有具体执行计算的对象
    private OperationApi operation;
    //操作的数据
    private int opeNum;

    public SubstractCommand(OperationApi operation, int opeNum) {
        this.operation = operation;
        this.opeNum = opeNum;
    }

    public OperationApi getOperation() {
        return operation;
    }

    public void setOperation(OperationApi operation) {
        this.operation = operation;
    }

    public int getOpeNum() {
        return opeNum;
    }

    public void setOpeNum(int opeNum) {
        this.opeNum = opeNum;
    }

    @Override
    public void execute() {
        operation.substract(opeNum);

    }

    @Override
    public void undo() {
        operation.add(opeNum);
    }
}
