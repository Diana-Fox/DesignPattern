package decorator;

public class ConcreteDecoratorB extends Decorator {


    /**
     * 构造方法传入组件对象
     *
     * @param component
     */
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 添加职责
     */
    private void addedBehavior() {
        //添加职责实现
    }

    @Override
    public void operation() {
        //子类添加附加动作，比如状态处理等
        super.operation();
        addedBehavior();
    }
}
