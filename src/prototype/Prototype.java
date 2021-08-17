package prototype;

/**
 * 声明一个克隆自身的接口，用来约束想要克隆自己的类，要求它们都要实现这里定义的克隆方法。
 */
public interface Prototype {
    /**
     * 克隆方法
     * @return 一个从自身克隆出来的对象
     */
    Prototype clone();
}
