package factory.simple;

public class ImplA implements Api{
    @Override
    public void operation(String str) {
        System.out.printf(str+"implA");
    }
}
