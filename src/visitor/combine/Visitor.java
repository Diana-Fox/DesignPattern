package visitor.combine;

public interface Visitor {
    /**
     * 针对组合对象的操作
     * 相当于给组合对象添加访问者
     *
     * @param composite
     */
    void visitorComposite(Composite composite);

    /**
     * 针对叶子对象的操作
     * 相当于给叶子对象添加访问者
     *
     * @param leaf
     */
    void visitorLeaf(Leaf leaf);
}
