package iterator.wages;

public class Client {
    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        test(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        test(salaryManager.createIterator());
    }

    private static void test(Iterator iterator) {
        iterator.first();
        while (!iterator.isDone()){
            PayModel o =(PayModel) iterator.currentItem();
            System.out.println("姓名："+o.getName()+",工资:"+o.getPay());
            iterator.next();
        }
    }
}
