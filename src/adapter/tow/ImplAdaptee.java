package adapter.tow;

public class ImplAdaptee implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("Adaptee的请求");
    }
}
