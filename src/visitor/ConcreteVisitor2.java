package visitor;

/**
 * 具体访问者的实现
 */
public class ConcreteVisitor2 implements Visitor {
    @Override
    public void visitConcreteElementA(ConcreteElementA element) {
        //把去访问者ConcreteElementA时，需要执行的功能实现在这里
        element.opertionA();
    }

    @Override
    public void visitConcreteElementB(ConcreteElementB element) {

        element.opertionB();
    }
}
