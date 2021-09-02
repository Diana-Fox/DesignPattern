package iterator.wages;

public class CollectionIteratorImpl implements Iterator {
    private PayManager aggregate;
    private int index = -1;

    public CollectionIteratorImpl(PayManager aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if (index < this.aggregate.size()) {
            index++;
        }
    }

    @Override
    public boolean isDone() {
        if (index == aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }
}
