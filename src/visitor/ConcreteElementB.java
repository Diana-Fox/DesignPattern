package visitor;

/**
 * 具体元素对象
 */
public class ConcreteElementB extends Element {
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementB(this);
    }

    public void opertionB() {
        //已有的功能实现
    }
}
