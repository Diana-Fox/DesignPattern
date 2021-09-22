package visitor;

public interface Visitor {
    /**
     * 访问元素A，相当于给元素A添加访问者的功能
     *
     * @param concreteElementA 元素A的对象
     */
    void visitConcreteElementA(ConcreteElementA concreteElementA);

    /**
     * 访问元素B，相当于给元素B添加访问者的功能
     *
     * @param concreteElementB 元素B的对象
     */
    void visitConcreteElementB(ConcreteElementB concreteElementB);
}
