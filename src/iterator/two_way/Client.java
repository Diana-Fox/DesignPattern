package iterator.two_way;

public class Client {
    public static void main(String[] args) {
        SalaryManager salaryManager = new SalaryManager();
        salaryManager.calcSalary();
        Iterator iterator = salaryManager.createIterator();
        iterator.first();
        if (!iterator.isDone()){
            PayModel payModel = (PayModel) iterator.currentItem();
            System.out.println("next1:"+payModel);
            iterator.next();
        }
        if (!iterator.isFirst()){
            iterator.previous();
            PayModel payModel = (PayModel) iterator.currentItem();
            System.out.println("pre1:"+payModel);
        }
        if (!iterator.isDone()){
            PayModel payModel = (PayModel) iterator.currentItem();
            System.out.println("next2:"+payModel);
            iterator.next();
        }
        if (!iterator.isDone()){
            PayModel payModel = (PayModel) iterator.currentItem();
            System.out.println("next3:"+payModel);
            iterator.next();
        }
        if (!iterator.isFirst()){
            iterator.previous();
            PayModel payModel = (PayModel) iterator.currentItem();
            System.out.println("pre2:"+payModel);
        }
    }
}
