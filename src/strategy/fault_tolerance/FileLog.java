package strategy.fault_tolerance;

//记录到文件
public class FileLog implements LogStrategy{
    @Override
    public void log(String msg) {
        System.out.println("把数据'"+msg+"'记录到文件中");
    }
}
