package command.log;

public class Client {
    public static void main(String[] args) {
        //厨师准备好
        CookManager.runCookManger();
        for (int i = 1; i < 50; i++) {
            Waiter waiter = new Waiter();
            ChopCommand chopCommand = new ChopCommand(i);
            DuckCommand duckCommand = new DuckCommand(i);
            waiter.orderDish(chopCommand);
            waiter.orderDish(duckCommand);
            waiter.orderOver();
         }
    }
}
