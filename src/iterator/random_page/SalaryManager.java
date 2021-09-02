package iterator.random_page;


public class SalaryManager {
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

        PayModel pm3 = new PayModel();
        pm3.setPay(6000);
        pm3.setName("宝儿");

        PayModel pm4 = new PayModel();
        pm4.setPay(4600);
        pm4.setName("宝贝");

        PayModel pm5 = new PayModel();
        pm5.setPay(4600);
        pm5.setName("宝~宝");

        pms = new PayModel[5];
        pms[0] = pm1;
        pms[1] = pm2;
        pms[2] = pm3;
        pms[3] = pm4;
        pms[4] = pm5;
    }

    public int size() {
        return pms.length;
    }

    public Object get(int index) {
        return pms[index];
    }

    public AggregationIterator createIterator() {
        return new ArrayIteratorImpl(this);
    }
}
