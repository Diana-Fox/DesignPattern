package iterator.two_way;

public class ArrayIteratorImpl implements Iterator {
    private SalaryManager aggregate;
    private int index ;

    public ArrayIteratorImpl(SalaryManager aggregate) {
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
        if (index == this.aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object currentItem() {
        return this.aggregate.get(index);
    }

    @Override
    public boolean isFirst() {
        if (index == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void previous() {
        if (index > -0) {
            index--;
        }
    }
}
