package iterator.wages;

public class SalaryManager extends Aggregate {
    private PayModel[] pms;

    public PayModel[] getPays() {
        return pms;
    }

    public void calcSalary() {
        PayModel pm1 = new PayModel();
        pm1.setPay(2200);
        pm1.setName("小宝");
        PayModel pm2 = new PayModel();
        pm2.setPay(4400);
        pm2.setName("宝宝");
        pms = new PayModel[2];
        pms[0] = pm1;
        pms[1] = pm2;
    }

    public int size() {
        return pms.length;
    }

    public Object get(int index) {
        return pms[index];
    }

    @Override
    protected Iterator createIterator() {
        return new ArrayIteratorImpl(this);
    }
}
