package iterator.two_way;

public interface Iterator {
    void first();

    void next();

    boolean isDone();

    Object currentItem();

    boolean isFirst();

    void previous();
}
