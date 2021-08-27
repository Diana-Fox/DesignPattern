package command.print;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }
    public void startPrint(){
        command.execute();
    }
}
