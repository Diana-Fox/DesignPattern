package responsibility;

public class Client {
    public static void main(String[] args) {
        //组装链
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();
        h1.setSuccessor(h2);
        h1.handleRequest();
    }
}
