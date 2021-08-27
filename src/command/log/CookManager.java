package command.log;

public class CookManager {
    //控制是否需要创建厨师
    private static boolean runFlag = false;

    //创建厨师并启动相应进程
    public static void runCookManger() {
        if (!runFlag) {
            runFlag = true;
            HotCook cook1 = new HotCook("张三");
            HotCook cook2 = new HotCook("李四");
            HotCook cook3 = new HotCook("王五");
            Thread thread1 = new Thread(cook1);
            thread1.start();
            Thread thread2 = new Thread(cook1);
            thread2.start();
            Thread thread3 = new Thread(cook1);
            thread3.start();
        }
    }
}
