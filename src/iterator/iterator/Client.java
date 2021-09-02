package iterator.iterator;


import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        PayManager payManager = new PayManager();
        payManager.calcPay();
        System.out.println("集团工资：");
        test(payManager.createIterator());

        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        System.out.println("新收购的：");
        test(salaryManager.createIterator());
    }

    private static void test(Iterator iterator) {
        while (iterator.hasNext()) {
            PayModel pm = (PayModel) iterator.next();
            System.out.println(pm);
        }
    }
}
