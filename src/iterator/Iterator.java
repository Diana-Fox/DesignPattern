package iterator;

//迭代器接口
public interface Iterator<T> {
    void first();

    void next();

    /**
     * 是否最后一个元素
     *
     * @return
     */
    boolean isDone();

    //迭代当前元素
    T currentItem();
}
