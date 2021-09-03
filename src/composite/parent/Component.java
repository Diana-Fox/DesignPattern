package composite.parent;

import java.util.List;

public abstract class Component {
    //父组件
    private Component parent;

    public Component getParent() {
        return parent;
    }

    public void setParent(Component parent) {
        this.parent = parent;
    }

    /**
     * 获取某个类的子组件
     *
     * @return
     */
    public List<Component> getChildren() {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    abstract void printStruct(String preStr);

    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    void removeChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    //根据索引获取组合对象
    Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
