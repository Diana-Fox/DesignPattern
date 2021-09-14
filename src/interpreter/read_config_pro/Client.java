package interpreter.read_config_pro;

public class Client {
    public static void main(String[] args) throws Exception {
        //当xml结构变化时，修改表达式的抽象语法树就可以

        //先准备上下文
        Context context = new Context("InterpreterTest.xml");

        //想要获取元素c的值，也就是表达式如下的值：“root/a/b/d$”
        //首先要构建解释器的抽象语法树
        ElementsExpression root = new ElementsExpression("root");
        ElementsExpression aEle = new ElementsExpression("a");
        ElementsExpression bEle = new ElementsExpression("b");
        ElementsTerminalExpression dEle = new ElementsTerminalExpression("d");
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(dEle);

        //调用
        String[] ss = root.interpret(context);
        for (String s :
                ss) {
            System.out.println("d的值是="+s);
        }

        //想要获取元素c的属性值，也就是表达式如下的值：“root/a/b/d$.id”
        //首先要构建解释器的抽象语法树
//        ElementsExpression root = new ElementsExpression("root");
//        ElementsExpression aEle = new ElementsExpression("a");
//        ElementsExpression bEle = new ElementsExpression("b");
//        ElementsExpression dEle = new ElementsExpression("d");
//        PropertyTerminalExpression prop = new PropertyTerminalExpression("id");
//        root.addEle(aEle);
//        aEle.addEle(bEle);
//        bEle.addEle(dEle);
//        dEle.addEle(prop);
//        //调用
//        String[] ss = root.interpret(context);
//        for (String s : ss) {
//            System.out.println("c的name属性值是=" + s);
//        }

    }
}
