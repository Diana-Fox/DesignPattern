package command.parameterization;

/**
 * 技嘉主板
 */
public class MsiBoard implements MainBoardApi {
    @Override
    public void open() {
        System.out.println("微星主板已经开机");
        System.out.println("开始开机自检");
        System.out.println("检查外设");
        System.out.println("装载系统");
        System.out.println("运行机器");
        System.out.println("机器正常启动");
    }

    @Override
    public void reset() {
        System.out.println("微星主板重启");

    }
}
