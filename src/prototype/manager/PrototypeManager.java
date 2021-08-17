package prototype.manager;

import java.util.HashMap;
import java.util.Map;

/**
 * 原型管理器
 */
public class PrototypeManager {
    private static Map<String, Prototype> map = new HashMap<String, Prototype>();

    /**
     * 私有化构造
     */
    private PrototypeManager() {
    }

    public synchronized static void setPrototype(String prototypeId, Prototype prototype) {
        map.put(prototypeId, prototype);
    }

    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }
    public synchronized static Prototype getPrototype(String prototypeId) throws Exception {
        Prototype prototype = map.get(prototypeId);
        if(prototype==null){
            throw new Exception("原型未注册或已销毁");
        }
        return prototype;
    }
}
