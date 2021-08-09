package facade;

public class BModuleImpl implements BModuleApi{
    @Override
    public void testB() {
        System.out.println("在B模块使用testB");
    }
}
