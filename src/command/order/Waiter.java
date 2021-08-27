package command.order;

public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    void orderDish(Command command) {
        HotCook hotCook = new HotCook();
        CoolCook coolCook = new CoolCook();
        if (command instanceof DuckCommand) {
            ((DuckCommand) command).setCookApi(hotCook);
        } else if (command instanceof ChopCommand) {
            ((ChopCommand) command).setCookApi(hotCook);
        } else if (command instanceof PorkCommand) {
            ((PorkCommand) command).setCookApi(coolCook);
        }
        menuCommand.addCommand(command);
    }

    public void orderOver() {
        this.menuCommand.execute();
    }
}
