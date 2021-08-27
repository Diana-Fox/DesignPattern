package command.order;

public class Client {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        ChopCommand chopCommand = new ChopCommand();
        DuckCommand duckCommand = new DuckCommand();
        PorkCommand porkCommand = new PorkCommand();

        waiter.orderDish(chopCommand);
        waiter.orderDish(duckCommand);
        waiter.orderDish(porkCommand);

        waiter.orderOver();
    }
}
