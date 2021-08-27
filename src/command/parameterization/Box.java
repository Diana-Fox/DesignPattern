package command.parameterization;

public class Box {
    private OpenCommand openCommand;
    private ResetCommand resetCommand;

    public ResetCommand getResetCommand() {
        return resetCommand;
    }

    public void setResetCommand(ResetCommand resetCommand) {
        this.resetCommand = resetCommand;
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

    public void ResetCommand() {
        resetCommand.execute();
    }
}
