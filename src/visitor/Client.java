package visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        Element eleA = new ConcreteElementA();
        Element eleB = new ConcreteElementB();
        os.addElement(eleA);
        os.addElement(eleB);
        Visitor visitor = new ConcreteVisitor1();
        os.handleRequest(visitor);
    }
}
