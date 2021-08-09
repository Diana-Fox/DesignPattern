package facade;

public class CModuleImpl implements CModuleApi {
    @Override
    public void testC() {
        System.out.println("在C模块使用testC");
    }
}
