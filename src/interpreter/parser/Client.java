package interpreter.parser;


public class Client {
    public static void main(String[] args) throws Exception {
        //先准备上下文
        Context context = new Context("InterpreterTest.xml");
        ReadXmlExpression tree1 = Parser.parse("root/a/e/d$.id$");
        String[] ss = tree1.interpret(context);
        for (String s : ss) {
            System.out.println("d的属性id值是=" + s);
        }

        //使用同一个上下文，连续进行解析，需要先重新初始化上下文对象
        context.reInit();
        ReadXmlExpression tree2 = Parser.parse("root/a/b/d$");
        String[] ss2 = tree2.interpret(context);
        for (String s :
                ss2) {
            System.out.println("d的值是=" + s);
        }

    }
}
