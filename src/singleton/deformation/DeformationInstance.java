package singleton.deformation;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例模式的变形用法，控制实例在一定数量内
 */
public class DeformationInstance {
    private final static String DEFAULT_PREKEY = "Cache_";
    //用容器存放实例对象
    private static Map<String, DeformationInstance> map = new HashMap<>();
    //当前实例的个数
    private static int num = 1;
    //最大实例数
    private final static int NUM_MAX = 3;

    private DeformationInstance() {
    }

    //理论上这里要加锁，此处忽略
    public static DeformationInstance getInstance() {
        String key = DEFAULT_PREKEY + num;
        DeformationInstance deformationInstance = map.get(key);
        if (deformationInstance == null) {
            deformationInstance = new DeformationInstance();
            map.put(key, deformationInstance);
        }
        num++;
        if (num > 3) {
            num = 1;
        }
        return deformationInstance;
    }
}
