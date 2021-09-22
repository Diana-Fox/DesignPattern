package visitor;

/**
 * 具体元素对象
 */
public class ConcreteElementA extends Element {
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitConcreteElementA(this);
    }

    public void opertionA() {
        //已有的功能实现
        System.out.println("elementA的操作");
    }
}
