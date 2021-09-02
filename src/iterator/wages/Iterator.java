package iterator.wages;

public interface Iterator {
    void first();
    void next();
    boolean isDone();
    Object currentItem();
}
