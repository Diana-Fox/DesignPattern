package command.counter;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //命令的历史操作，撤销时使用
    private List<Command> undoCmds = new ArrayList<>();
    //命令的被撤销历史记录，恢复时候用
    private List<Command> redoCmds = new ArrayList<>();
    private AddCommand addCommand;
    private SubstractCommand substractCommand;

    public AddCommand getAddCommand() {
        return addCommand;
    }

    public void setAddCommand(AddCommand addCommand) {
        this.addCommand = addCommand;
    }

    public SubstractCommand getSubstractCommand() {
        return substractCommand;
    }

    public void setSubstractCommand(SubstractCommand substractCommand) {
        this.substractCommand = substractCommand;
    }

    /**
     * 添加操作
     */
    public void addPressed() {
        this.addCommand.execute();
        //把操作记录到历史记录里面
        undoCmds.add(this.addCommand);
    }

    public void substractPressed() {
        this.substractCommand.execute();
        undoCmds.add(this.substractCommand);
    }

    //撤销
    public void undoPressed() {
        if (this.undoCmds.size() > 0) {
            Command command = this.undoCmds.get(this.undoCmds.size() - 1);
            command.undo();
            this.redoCmds.add(command);
        } else {
            System.out.println("无可撤销的命令。");
        }
    }

    //恢复撤销
    public void redoPressed() {
        if (this.redoCmds.size() > 0) {
            Command command = this.redoCmds.get(this.redoCmds.size() - 1);
            command.execute();
            this.undoCmds.add(command);
            this.redoCmds.remove(command);
        } else {
            System.out.println("无可恢复 的命令。");
        }
    }
}
