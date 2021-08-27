package command.log;


import java.io.Serializable;

public class ChopCommand implements Command, Serializable {
    private CookApi cookApi;
    private int tableNum;

    public ChopCommand(int tableNum) {
        this.tableNum = tableNum;
    }

    @Override
    public void execute() {
        this.cookApi.cook(tableNum,"绿豆排骨汤");
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
