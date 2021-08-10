package singleton;

import singleton.enums.EnumSingleton;
import singleton.hungry.HungrySingleton;
import singleton.lazy.LazySingleton;

public class Client {
    public static void main(String[] args) {
        HungrySingleton instance = HungrySingleton.getInstance();
        instance.op();
        LazySingleton instance1 = LazySingleton.getInstance();
        instance1.op();
        EnumSingleton sigleton = EnumSingleton.sigleton;
        sigleton.op();
    }
}
