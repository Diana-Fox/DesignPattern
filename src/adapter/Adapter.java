package adapter;

/**
 * 适配器接口,本质上是一个Target对象
 */
public class Adapter implements Target {
    /**
     * 要持有需要被适配的对象
     */
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
