package memento.storage_recovery;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    //命令操作的历史记录，便于撤销使用
    private List<Command> undoCmds = new ArrayList<>();
    //命令的撤销记录
    private List<Command> redoCmds = new ArrayList<>();
    //命令操作的备忘录
    private List<Memento[]> undoMementos = new ArrayList<>();
    //撤销操作的备忘录
    private List<Memento[]> redoMementos = new ArrayList<>();
    private Command addCmd;
    private Command subractCmd;

    public void setAddCmd(Command addCmd) {
        this.addCmd = addCmd;
    }

    public void setSubractCmd(Command subractCmd) {
        this.subractCmd = subractCmd;
    }

    public void addPressed() {
        Memento m1 = addCmd.createMemento();
        addCmd.execute();
        undoCmds.add(addCmd);
        Memento m2 = addCmd.createMemento();
        undoMementos.add(new Memento[]{m1, m2});

    }

    public void substractPressed() {
        Memento m1 = subractCmd.createMemento();
        subractCmd.execute();
        undoCmds.add(subractCmd);
        Memento m2 = subractCmd.createMemento();
        undoMementos.add(new Memento[]{m1, m2});
    }

    public void undoPressed() {
        if (undoCmds.size() > 0) {
            //取出最后一个来进行撤销
            Command command = undoCmds.get(undoCmds.size() - 1);
            //获取对应的备忘录对象
            Memento[] mementos = undoMementos.get(undoCmds.size() - 1);
            //撤销到初始操作
            command.undo(mementos[0]);
            redoCmds.add(command);
            redoMementos.add(mementos);
            undoCmds.remove(command);
            undoMementos.remove(mementos);
        } else {
            System.out.println("无可撤销命令");
        }
    }
    public void redoPressed(){
        if (redoCmds.size() > 0) {
            //取出最后一个来重做
            Command command = redoCmds.get(redoCmds.size() - 1);
            //获取对应的备忘录对象
            Memento[] mementos = redoMementos.get(redoCmds.size() - 1);
            //重做
            command.redo(mementos[1]);
            undoCmds.add(command);
            undoMementos.add(mementos);
            redoCmds.remove(command);
            redoMementos.remove(mementos);
        } else {
            System.out.println("无可重做命令");
        }
    }
}
