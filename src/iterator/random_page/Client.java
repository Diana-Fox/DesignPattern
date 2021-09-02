package iterator.random_page;


import java.util.Collection;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        AggregationIterator iterator = salaryManager.createIterator();
        Collection page = iterator.getPage(2, 2);
        System.out.println("输出第二页");
        print(page);

    }

    private static void print(Collection col) {
        Iterator iterator = col.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
