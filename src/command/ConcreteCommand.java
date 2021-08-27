package command;

/**
 * 命令接口的“虚”实现，持有接收者，并调用接收者的功能来完成命令要执行的操作
 */
public class ConcreteCommand implements Command {
    /**
     * 持有接收者对象
     */
    private Receiver receiver;
    /**
     * 命令对象自己的状态
     */
    private String state;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //通常会调转接受者对象的相应方法，让接受者来真正执行功能
        receiver.action();
    }
}
