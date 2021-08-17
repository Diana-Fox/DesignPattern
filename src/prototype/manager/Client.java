package prototype.manager;

public class Client {
    public static void main(String[] args) throws Exception {
        ConcretePrototype1 prototype1 = new ConcretePrototype1();
        prototype1.setName("小宝");
        PrototypeManager.setPrototype("prototype1", prototype1);
        //只演示获取了，别的类似
        Prototype prototype11 = PrototypeManager.getPrototype("prototype1").clone();
        System.out.println("克隆对象初始名称:"+prototype11.getName());
        prototype11.setName("张三");
        System.out.println("克隆了一下,名称："+prototype11.getName());
    }
}
