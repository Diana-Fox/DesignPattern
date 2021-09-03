package composite;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        Composite c1 = new Composite();
        Composite c2 = new Composite();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(leaf1);
        c1.addChild(leaf2);
        c2.addChild(leaf3);
        Component children = root.getChildren(0);
        System.out.println(children);
    }
}
