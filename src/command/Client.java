package command;

/**
 * 创建具体的命令对象，并设置命令对象的接收者，实际就是将对象进行装配
 */
public class Client {
    public void assemble() {
        //创建接受者
        Receiver receiver = new Receiver();
        //命令对象，设置接受者
        Command command = new ConcreteCommand(receiver);
        //创建invoker
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
    }
}
