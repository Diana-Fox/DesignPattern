package command.parameterization;

public class ResetCommand implements Command {
    private MainBoardApi mainBoardApi;

    public ResetCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        this.mainBoardApi.reset();
    }
}
