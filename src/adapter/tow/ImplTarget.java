package adapter.tow;

public class ImplTarget implements Target{
    @Override
    public void request() {
        System.out.println("Target的request");
    }
}
