package iterator;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();
        client.someOperation();
    }
    public void someOperation(){
        String[] name={"小宝","宝宝","宝贝"};
        Aggregate aggregate = new ConcreteAggregate(name);
        Iterator iterator = aggregate.createIterator();
        iterator.first();
        while (!iterator.isDone()){
            Object o = iterator.currentItem();
            System.out.println("打印内容："+o);
            iterator.next();
        }
    }
}
