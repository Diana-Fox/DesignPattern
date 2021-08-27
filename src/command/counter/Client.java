package command.counter;

public class Client {
    public static void main(String[] args) {
        OperationApi operation = new Operation();
        AddCommand addCommand = new AddCommand(operation, 5);
        SubstractCommand substractCommand = new SubstractCommand(operation,3);
        Calculator calculator = new Calculator();
        calculator.setAddCommand(addCommand);
        calculator.setSubstractCommand(substractCommand);

        calculator.addPressed();
        System.out.println("执行加法后的结果为"+operation.getResult());
        calculator.substractPressed();
        System.out.println("执行减法后的结果为"+operation.getResult());
        calculator.addPressed();
        System.out.println("执行加法后的结果为"+operation.getResult());

        //撤销操作
        calculator.undoPressed();
        System.out.println("撤销一次后结果为："+operation.getResult());
        calculator.redoPressed();
        System.out.println("取消撤销后的结果为"+operation.getResult());
        //撤销操作
        calculator.redoPressed();
        System.out.println("恢复操作一次后结果为："+operation.getResult());
        calculator.redoPressed();
        System.out.println("再恢复操作后的结果为"+operation.getResult());
    }
}
