package composite.ringlike;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("服装");
        Component c1 = new Composite("男装");
        Component c2 = new Composite("衬衣");
        Component c3 = new Composite("男装");
        //设置一个环状引用
        try {
            root.addChild(c1);
            c1.addChild(c2);
//            c2.addChild(c3);
        } catch (IllegalAccessException e) {
             e.printStackTrace();
        }
        root.printStruct("");
    }
}
