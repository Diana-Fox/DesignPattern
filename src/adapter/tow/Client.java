package adapter.tow;

public class Client {
    public static void main(String[] args) {
        Adaptee towWayAdapter = new TowWayAdapter(new ImplAdaptee(), new ImplTarget());
        towWayAdapter.specificRequest();
    }
}
