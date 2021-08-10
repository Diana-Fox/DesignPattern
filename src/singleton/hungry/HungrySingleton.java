package singleton.hungry;

/**
 * 饿汉式单例
 */
public class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
    public void op(){
        System.out.println("饿汉式的单例");
    }
}
