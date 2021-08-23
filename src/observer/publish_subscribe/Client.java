package observer.publish_subscribe;

public class Client {
    public static void main(String[] args) {
        NewsPaper newsPaper = new NewsPaper();

        Reader reader1 = new Reader();
        reader1.setName("小宝");
        Reader reader2 = new Reader();
        reader2.setName("宝宝");
        Reader reader3 = new Reader();
        reader3.setName("宝贝");

        newsPaper.attach(reader1);
        newsPaper.attach(reader2);
        newsPaper.attach(reader3);

        newsPaper.setContent("学好观察者模式");
    }
}
