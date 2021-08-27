package command.power_on;

/**
 * 开机命令
 */
public class OpenCommand implements Command {
    private MainBoardApi mainBoardApi;

    public OpenCommand(MainBoardApi mainBoardApi) {
        this.mainBoardApi = mainBoardApi;
    }

    @Override
    public void execute() {
        this.mainBoardApi.open();
    }
}
