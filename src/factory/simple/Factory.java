package factory.simple;

/**
 * 工厂类
 */
public class Factory {
    /**
     * 根据不同的条件，生成不同的对象
     * 如果只有一个实现，则忽略条件
     *
     * @param type
     * @return
     */
    public static Api createApi(int type) {
        if (type == 1)
            return new ImplA();
        else
            return new ImplB();
    }
}
