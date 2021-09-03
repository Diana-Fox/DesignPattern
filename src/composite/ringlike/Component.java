package composite.ringlike;

public abstract class Component {
    private String componentPath = "";

    public String getComponentPath() {
        return componentPath;
    }

    public void setComponentPath(String componentPath) {
        this.componentPath = componentPath;
    }

    public abstract String getName();

    public abstract void printStruct(String preStr);

    public void addChild(Component child) throws IllegalAccessException {
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
