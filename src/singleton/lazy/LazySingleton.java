package singleton.lazy;

/**
 * 懒汉式单例
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {

    }

    /**
     * 通过加锁来实现单例
     *
     * @return
     */
    public static synchronized LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public void op() {
        System.out.println("懒汉式的单例");
    }
}
