package strategy.strategy_template;

//记录到文件
public class FileLog extends LogStrategyTemplate {

    @Override
    protected void doLog(String msg) {
        System.out.println("把数据'" + msg + "'记录到文件中");
    }
}
