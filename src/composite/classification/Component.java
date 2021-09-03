package composite.classification;

public abstract class Component {
    abstract void printStruct(String preStr);

    public void addChild(Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
    void removeChild(composite.Component child) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }

    //根据索引获取组合对象
    composite.Component getChildren(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
