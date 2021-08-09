package facade;

public class AModuleImpl implements AModuleApi{
    @Override
    public void testA() {
        System.out.println("在A模块使用testA");
    }
}
