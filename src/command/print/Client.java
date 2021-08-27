package command.print;

public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new PrintService("小宝"));
        invoker.startPrint();
    }
}
