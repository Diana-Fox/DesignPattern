package iterator.random_page;


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
        if (pms != null && index < pms.length) {
            return true;
        }
        return false;
    }

    @Override
    public boolean hasPrevious() {
        if (pms != null && index > 0) {
            return true;
        }
        return false;
    }

    @Override
    public Collection getPage(int pageNum, int pageSize) {
        Collection temp = new ArrayList();
        int start = (pageNum - 1) * pageSize;
        int end = start + pageSize - 1;
        if (start < 0) {
            start = 0;
        }
        if (end > pms.length - 1) {
            end = pms.length - 1;
        }
        index = 0;
        while (hasNext() && index <= end) {
            if (index >= start) {
                temp.add(pms[index]);
            }
            index++;
        }
        return temp;
    }
}
