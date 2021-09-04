package template_method;

public class ConcreteClass extends AbstractClass {
    @Override
    public void doPrimitiveOperation1() {
        System.out.println("步骤1");
    }

    @Override
    public void doPrimitiveOperation2() {
        System.out.println("步骤2");
    }
}
