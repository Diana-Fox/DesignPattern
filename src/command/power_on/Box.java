package command.power_on;

public class Box {
    private OpenCommand openCommand;

    public Box(OpenCommand openCommand) {
        this.openCommand = openCommand;
    }

    public OpenCommand getOpenCommand() {
        return openCommand;
    }

    public void setOpenCommand(OpenCommand openCommand) {
        this.openCommand = openCommand;
    }

    public void openButtonPressed() {
        openCommand.execute();
    }
}
