package command.log;

public class HotCook implements CookApi, Runnable {
    private String name;

    public HotCook(String name) {
        this.name = name;
    }

    @Override
    public void cook(int tableNum, String name) {
        System.out.println("厨师正在做" + tableNum + "的" + name);
        //随机一个时间间隔
        int cookTime = (int) (20 * Math.random());
        try {
            Thread.sleep(cookTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("厨师正在做" + tableNum + "的" +
                name + "做好了，用时" + cookTime +"秒");
    }

    @Override
    public void run() {
        while (true) {
            Command command = CommandQueue.getOneCommand();
            if (command != null) {//获取到对象了，执行方法
                command.setCookApi(this);
                command.execute();
            }
            //歇1S再看看
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
