package command.power_on;

public class Client {
    public static void main(String[] args) {
        //对象创建并组合
        MainBoardApi gigaMainBoard = new GigaMainBoard();
        OpenCommand openCommand = new OpenCommand(gigaMainBoard);
        //真实测试
        Box box = new Box(openCommand);
        box.openButtonPressed();
    }
}
