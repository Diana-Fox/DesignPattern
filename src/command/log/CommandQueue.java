package command.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    private final static String FINE_NAME = "CmdQueue.txt";
    /**
     * 存储命令对象的队列
     */
    private static List<Command> cmds = null;


    //静态代码块
    static {
        //获取上次没做完的命令队列
        try {
            cmds = FileOpenUtil.readFile(FINE_NAME);
            if (cmds == null) {
                cmds = new ArrayList<>();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //服务员提交新菜单，菜单入队
    public synchronized static void addMenu(MenuCommand menu) {
        for (Command cmd :
                menu.getCommands()) {
            cmds.add(cmd);
            FileOpenUtil.writeFile(FINE_NAME, cmds);
        }
    }

    //处理队列中的命令对象
    public synchronized static Command getOneCommand() {
        Command command = null;
        if (cmds.size() > 0) {
            //先进先出
            command = cmds.get(0);
            cmds.remove(0);
            //记录请求的日志
            FileOpenUtil.writeFile(FINE_NAME, cmds);
        }
        return command;
    }
}
