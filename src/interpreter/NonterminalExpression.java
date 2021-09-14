package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 非终结符表达式==相当于组合对象
 * 用来实现语法规则中非终结符相关的操作，通常一个解释器对应一个语法规则，
 * 可以包含其他的解释器，如果用组合模式来构建抽象语法树的话，相当于组合模式中的组合对象，
 * 可以有多种非终结符解释器。
 */
public class NonterminalExpression extends AbstractExpression {
    //包含的组件
    private List<AbstractExpression> list = new ArrayList<>();

    public void addAbstractExpression(AbstractExpression abstractExpression) {
        //添加叶子节点等
        list.add(abstractExpression);
    }

    @Override
    public void interpret(Context ctx) {
        //实现与语法规则中的非终结符相关联的结解释操作
    }
}
