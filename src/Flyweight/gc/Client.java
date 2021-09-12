package Flyweight.gc;



public class Client {
    public static void main(String[] args) {
        SecurityManger manger = SecurityManger.getInstance();

        //
        boolean f1 = manger.hasPermit("小宝", "薪资数据", "查看");
        boolean f2 = manger.hasPermit("宝宝", "薪资数据", "查看");
        boolean f3 = manger.hasPermit("宝宝", "薪资数据", "修改");

        try {
            Thread.sleep(4000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            manger.hasPermit("小宝"+i,"薪资数据", "查看");
        }

        System.out.println("薪资数据,查看 被引用了"+FlyweightFactory.getInstance().
                getUseTimes("薪资数据,查看")+"次");
        System.out.println("薪资数据,修改 被引用了"+FlyweightFactory.getInstance().
                getUseTimes("薪资数据,修改")+"次");
        System.out.println("人员列表,查看 被引用了"+FlyweightFactory.getInstance().
                getUseTimes("人员列表,查看")+"次");

    }
}
