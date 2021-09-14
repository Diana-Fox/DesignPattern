package interpreter.read_config_plus;

public class Client {
    public static void main(String[] args) throws Exception {
        //当xml结构变化时，修改表达式的抽象语法树就可以

        //先准备上下文
        Context context = new Context("InterpreterTest.xml");

//        //想要获取元素c的值，也就是表达式如下的值：“root/a/b/c”
//        //首先要构建解释器的抽象语法树
//        ElementExpression root = new ElementExpression("root");
//        ElementExpression aEle = new ElementExpression("a");
//        ElementExpression bEle = new ElementExpression("b");
//        ElementTerminalExpression cEle = new ElementTerminalExpression("c");
//        root.addEle(aEle);
//        aEle.addEle(bEle);
//        bEle.addEle(cEle);
//
//        //调用
//        String[] ss = root.interpret(context);
//        System.out.println("c的值是=" + ss[0]);

        //想要获取元素c的属性值，也就是表达式如下的值：“root/a/b/c.name”
        //首先要构建解释器的抽象语法树
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementExpression cEle = new ElementExpression("c");
        PropertyTerminalExpression prop = new PropertyTerminalExpression("name");
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        cEle.addEle(prop);
        //调用
        String[] ss = root.interpret(context);
        System.out.println("c的name属性值是=" + ss[0]);

    }
}
