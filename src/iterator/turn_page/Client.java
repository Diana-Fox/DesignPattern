package iterator.turn_page;

import java.util.Collection;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        AggregationIterator iterator = salaryManager.createIterator();
        Collection col1 = iterator.next(2);
        System.out.println("第一页数据" );
        print(col1);
        Collection col2 = iterator.next(2);
        System.out.println("第二页数据" );
        print(col2);
        Collection col3 = iterator.previous(2);
        System.out.println("还是第二页数据" );
        print(col3);
    }

    private static void print(Collection col) {
        Iterator iterator = col.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            System.out.println(object);
        }
    }
}
