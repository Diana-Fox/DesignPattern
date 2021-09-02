package iterator.iterator;


import java.util.Iterator;

public class ArrayIteratorImpl implements Iterator {
    //聚合对象
    private SalaryManager aggregate;

    public ArrayIteratorImpl(SalaryManager aggregate) {
        this.aggregate = aggregate;
    }

    private int index = 0;

    @Override
    public boolean hasNext() {
        if (aggregate != null && index < aggregate.getPays().length)
            return true;
        return false;
    }

    @Override
    public Object next() {
        Object retObj = null;
        if (hasNext()) {
            retObj = aggregate.get(index);
            index++;
        }
        return retObj;
    }
}
