package command.order;

public class DuckCommand implements Command {
    private CookApi cookApi;

    public CookApi getCookApi() {
        return cookApi;
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    @Override
    public void execute() {
        cookApi.cook("北京烤鸭。");
    }
}
