package factory.simple;

public class ImplB implements Api{
    @Override
    public void operation(String str) {
        System.out.printf(str+"implB");
    }
}
