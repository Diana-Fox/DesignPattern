package composite.security;

public class Client {
    public static void main(String[] args) {
        Composite root = new Composite("服装");
        Composite c1 = new Composite("男装");
        Composite c2 = new Composite("女装");

        Leaf l1 = new Leaf("衬衣");
        Leaf l2 = new Leaf("夹克");
        Leaf l3 = new Leaf("裙子");
        Leaf l4 = new Leaf("套装");

        root.addChild(c1);
        root.addChild(c2);

        c1.addChild(l1);
        c1.addChild(l2);
        c2.addChild(l3);
        c2.addChild(l4);

        root.printStruct("");
    }
}
