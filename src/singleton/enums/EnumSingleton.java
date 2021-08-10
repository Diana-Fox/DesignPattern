package singleton.enums;

public enum EnumSingleton {
    //枚举元素其实等价于public final static Singleton EnumSingleton=new EnumSingleton
    sigleton;

    public void op() {
        System.out.println("我是用枚举搞的单例");
    }
}
