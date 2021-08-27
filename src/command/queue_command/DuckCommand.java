package command.queue_command;


public class DuckCommand implements Command {
    private CookApi cookApi;
    private int tableNum;

    public DuckCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum, "北京烤鸭");
    }


    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public int getTableNum() {
        return tableNum;
    }

    public void setTableNum(int tableNum) {
        this.tableNum = tableNum;
    }

    public CookApi getCookApi() {
        return cookApi;
    }
}
