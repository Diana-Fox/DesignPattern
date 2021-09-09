package memento.storage_recovery;

public class Client {
    public static void main(String[] args) {
        Operation operation = new Operation();
        AddCommand addCommand = new AddCommand(5);
        SubstractCommand substractCommand = new SubstractCommand(3);

        addCommand.setOperation(operation);
        substractCommand.setOperation(operation);

        Calculator calculator = new Calculator();
        calculator.setAddCmd(addCommand);
        calculator.setSubractCmd(substractCommand);

        calculator.addPressed();
        System.out.println("一次加法后的结果为：" + operation.getResult());
        calculator.substractPressed();
        System.out.println("一次减法后的结果为：" + operation.getResult());

        calculator.undoPressed();
        System.out.println("一次撤销后的结果为：" + operation.getResult());
        calculator.undoPressed();
        System.out.println("再一次撤销后的结果为：" + operation.getResult());

        calculator.redoPressed();
        System.out.println("一次恢复后的结果为：" + operation.getResult());
        calculator.redoPressed();
        System.out.println("再一次恢复撤销后的结果为：" + operation.getResult());

    }
}
