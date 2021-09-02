package iterator.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PayManager extends Aggregate {
    private List<PayModel> list = new ArrayList();

    public List<PayModel> getPayList() {
        return list;
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

    @Override
    public Iterator createIterator() {
        return list.iterator();
    }
}
