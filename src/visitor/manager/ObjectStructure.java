package visitor.manager;

import java.util.ArrayList;
import java.util.Collection;


public class ObjectStructure {
    /**
     * 要操作的客户集合
     */
    private Collection<Customer> col = new ArrayList<>();

    /**
     * 提供给客户端操作的高层接口，具体的功能由客户端传入的访问者决定
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        for (Customer cm : col) {
            cm.accept(visitor);
        }
    }

    /**
     * 组件对象
     * @param ele
     */
    public void addElement(Customer ele) {
        this.col.add(ele);
    }
}
