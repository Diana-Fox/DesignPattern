package template_method;

public abstract class AbstractClass {
    //源语操作，就是要抽象的操作，必须由子类提供实现
    public abstract void doPrimitiveOperation1();

    public abstract void doPrimitiveOperation2();

    /**
     * 模板方法，定义算法骨架
     */
    public final void templateMethod() {
        doPrimitiveOperation1();
        doPrimitiveOperation2();
    }
}
