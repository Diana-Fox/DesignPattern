package command.queue_command;

import java.util.ArrayList;
import java.util.List;

public class MenuCommand implements Command {
    //记录多个菜品（命令对象），组成菜单
    private List<Command> cmds = new ArrayList<>();

    @Override
    public void execute() {
        CommandQueue.addMenu(this);
    }

    public void addCommand(Command cmd) {
        cmds.add(cmd);
    }

    @Override
    public void setCookApi(CookApi cookApi) {

    }

    @Override
    public int getTableNum() {
        return 0;
    }

    public List<Command> getCommands() {
        return this.cmds;
    }

    public List<Command> getCmds() {
        return cmds;
    }

}
