package interpreter;

/**
 * 终结符表达式
 * 实现语法规则中和终结符相关的操作，不再包含其他的解释器，
 * 如果用组合模式来构建抽象语法树的话，就相当于组合模式中的叶子对象，
 * 可以有多种终结符解释器
 */
public class TerminalExpression extends AbstractExpression {
    @Override
    public void interpret(Context ctx) {
        //实现与语法规则中的终结符相关联的结束操作

    }
}
