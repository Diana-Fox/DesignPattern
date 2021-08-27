package command.log;

public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    //点菜，添加菜
    public void orderDish(Command command) {
        menuCommand.addCommand(command);
    }

    //点完了
    public void orderOver() {
        this.menuCommand.execute();
    }
}
