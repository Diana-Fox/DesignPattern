package visitor;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 对象结构，通常在这里对元素对象进行便利，让访问者能访问带所有的元素
 */
public class ObjectStructure {
    //表示对象结构，可以是一个组合结构或是集合
    private Collection<Element> col = new ArrayList<>();

    /**
     * 提供给客户端操作的高层接口
     *
     * @param visitor 客户端需要使用的访问者
     */
    public void handleRequest(Visitor visitor) {
        for (Element ele : col) {
            ele.accept(visitor);
        }
    }

    public void addElement(Element ele) {
        this.col.add(ele);
    }
}
