package command.parameterization;

public class Client {
    public static void main(String[] args) {
        //对象创建并组合
        MainBoardApi gigaMainBoard = new GigaMainBoard();
        //创建开机命令
        OpenCommand openCommand = new OpenCommand(gigaMainBoard);
        //创建重启命令
        ResetCommand resetCommand = new ResetCommand(gigaMainBoard);

        //真实测试
        Box box = new Box();
        box.setOpenCommand(openCommand);
        box.setResetCommand(resetCommand);
        System.out.println("按开机按钮");
        box.openButtonPressed();
        System.out.println("按下重启按钮");
        box.ResetCommand();
    }
}
