package iterator.turn_page;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayIteratorImpl implements AggregationIterator {
    private PayModel[] pms;
    private int index;

    public ArrayIteratorImpl(SalaryManager salaryManager) {
        this.pms = salaryManager.getPays();
    }

    @Override
    public boolean hasNext() {
        if (pms != null && index <= pms.length)
            return true;
        return false;
    }

    @Override
    public Collection next(int num) {
        Collection temp = new ArrayList();
        int count = 0;
        while (hasNext() && count < num) {
            temp.add(pms[index++]);
            count++;
        }
        return temp;
    }

    @Override
    public boolean hasPrevious() {
        if (pms != null && index > 0)
            return true;
        return false;
    }

    @Override
    public Collection previous(int num) {
        Collection temp = new ArrayList();
        int count = 0;
        index = index - num;
        while (hasPrevious() && count < num) {
            temp.add(pms[index++]);
            count++;
        }
        return temp;
    }
}
