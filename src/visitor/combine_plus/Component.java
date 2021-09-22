package visitor.combine_plus;


import java.util.ArrayList;
import java.util.List;

public abstract class Component {

    /**
     * 抽象的组件对象，相当于访问者模式中的元素对象
     * 用此方法代替业务方法
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

    /**
     * 向组合对象中加入组件对象
     *
     * @param child
     */
    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 从组合对象中移除某个组件对象
     *
     * @param child
     */
    public void removeChile(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    /**
     * 根据索引获取子节点
     *
     * @param index
     * @return
     */
    public Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }


}
