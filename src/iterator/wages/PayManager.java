package iterator.wages;

import java.util.ArrayList;
import java.util.List;

public class PayManager extends Aggregate {
    private List list = new ArrayList<>();

    public PayManager() {

    }

    public void calcPay() {
        PayModel pm1 = new PayModel();
        pm1.setPay(2400);
        pm1.setName("宝儿");
        PayModel pm2 = new PayModel();
        pm2.setPay(4200);
        pm2.setName("小宝");
        list.add(pm1);
        list.add(pm2);
    }

    public int size() {
        return list.size();
    }

    public Object get(int index) {
        return list.get(index);
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIteratorImpl(this);
    }
}
