package iterator;

public abstract interface Aggregate<T> {
    public abstract Iterator createIterator();
}
