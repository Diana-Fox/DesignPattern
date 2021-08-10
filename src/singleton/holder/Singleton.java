package singleton.holder;

/**
 * 用内部类持有的方式
 * 静态成员类型的内部类，该内部类的实例与外部类的实例没有绑定关系
 * 而且只有被调用才会装载，从而实现了延迟加载
 */
public class Singleton {
    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
