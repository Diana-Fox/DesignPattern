package composite;

import java.util.List;

//抽象的组件对象，为组合中的对象声明接口，实现接口的缺省行为
public abstract class Component {
    abstract void someOperation();

    void addChild(Component child) {
        //叶节点不能添加
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
