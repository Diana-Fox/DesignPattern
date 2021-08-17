package prototype;

/**
 * 实现ProtoType,真正实现克隆功能
 */
public class ConcretePrototype1 implements Prototype {

    /**
     * 最简单，克隆自身，没有属性，不需要复制值
     * @return
     */
    @Override
    public Prototype clone() {
        return new ConcretePrototype1();
    }
}
