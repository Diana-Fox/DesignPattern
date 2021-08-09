package facade;

public class Facade {
    /**
     * 在内部实现的时候可能会调用内部的多个模块
     * 此处可以使用简单工厂进行选择等
     */
    public void test() {
        AModuleApi aModule = new AModuleImpl();
        aModule.testA();
        BModuleApi bModule = new BModuleImpl();
        bModule.testB();
        CModuleApi cModule = new CModuleImpl();
        cModule.testC();
    }
}
