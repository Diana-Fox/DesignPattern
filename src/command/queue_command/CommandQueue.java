package command.queue_command;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    /**
     * 存储命令对象的队列
     */
    private static List<Command> cmds = new ArrayList<>();

    //服务员提交新菜单，菜单入队
    public synchronized static void addMenu(MenuCommand menu) {
        for (Command cmd :
                menu.getCommands()) {
            cmds.add(cmd);
        }
    }

    //处理队列中的命令对象
    public synchronized static Command getOneCommand() {
        Command command = null;
        if (cmds.size() > 0) {
            //先进先出
            command = cmds.get(0);
            cmds.remove(0);
        }
        return command;
    }
}
