package decorator;

/**
 * 装饰器接口，维持一个指向组件对象的接口对象
 */
public class Decorator extends Component {
    /**
     * 持有组件对象
     */
    protected Component component;

    /**
     * 构造方法传入组件对象
     *
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        System.out.println("begin");
        //转发请求给组件对象，可以在转发前后执行一些附加动作
        component.operation();
        System.out.println("after");
    }
}
