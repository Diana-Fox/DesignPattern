package iterator.filter;


import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteratorImpl implements Iterator {

    private PayModel[] pms;
    private int index;

    public ArrayIteratorImpl(SalaryManager salaryManager) {
        ArrayList<PayModel> temps = new ArrayList<>();
        //只显示工资小于3k的
        for (PayModel pm :
                salaryManager.getPays()) {
            if (pm.getPay() < 3000) {
                temps.add(pm);
            }
        }
        this.pms = new PayModel[temps.size()];
        int i = 0;
        for (PayModel pm :
                temps) {
            pms[i++] = pm;
        }
    }

    @Override
    public boolean hasNext() {
        if (pms != null && index <= pms.length - 1)
            return true;
        return false;
    }

    @Override
    public Object next() {
        Object retObj = null;
        if (hasNext()) {
            retObj = pms[index++];
        }
        //对返回数据过滤，不让看工资
        ((PayModel) retObj).setPay(0);
        return retObj;
    }
}
