package iterator;

import java.util.List;

public class ConcreteIterator implements Iterator {
    //持有被迭代对象
    private ConcreteAggregate  aggregate;
    //下标初始为-1
    private int index = -1;

    public ConcreteIterator(ConcreteAggregate aggregate) {
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
