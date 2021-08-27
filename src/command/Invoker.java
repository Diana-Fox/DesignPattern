package command;

/**
 * 要求命令对象执行请求，通常持有命令对象，可以持有很多的命令对象。
 * 是真正触发命令并要求命令执行相应操作的地方，是使用命令对象的入口。
 */
public class Invoker {
    //获得命令对象
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    } 

    /**
     * 要求命令执行
     */
    public void runCommand() {
        command.execute();
    }
}
