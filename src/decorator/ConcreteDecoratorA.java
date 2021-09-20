package decorator;

public class ConcreteDecoratorA extends Decorator {


    /**
     * 构造方法传入组件对象
     *
     * @param component
     */
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    //添加状态
    private String addedState;

    public void setAddedState(String addedState) {
        this.addedState = addedState;
    }

    @Override
    public void operation() {
        //子类添加附加动作，比如状态处理等
        super.operation();
    }
}
