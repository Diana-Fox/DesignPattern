package adapter.tow;

/**
 * 双向适配器
 */
public class TowWayAdapter implements Adaptee, Target {
    private Adaptee adaptee;
    private Target target;

    public TowWayAdapter(Adaptee adaptee, Target target) {
        this.adaptee = adaptee;
        this.target = target;
    }

    @Override
    public void specificRequest() {
        target.request();
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
