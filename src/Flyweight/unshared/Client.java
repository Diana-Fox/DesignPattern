package Flyweight.unshared;


public class Client {
    public static void main(String[] args) {
        SecurityManger manger = SecurityManger.getInstance();
        //先登录一下
        manger.login("小宝");
        manger.login("宝宝");
        //
        boolean f1 = manger.hasPermit("小宝", "薪资数据", "查看");
        boolean f2 = manger.hasPermit("宝宝", "薪资数据", "查看");
        boolean f3 = manger.hasPermit("宝宝", "薪资数据", "修改");

        System.out.println("f1=="+f1);
        System.out.println("f2=="+f2);
        System.out.println("f3=="+f3);

        for (int i = 0; i < 3; i++) {
            manger.login("小宝"+i);
            manger.hasPermit("小宝"+i,"薪资数据", "查看");
        }
    }
}
