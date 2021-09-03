package composite.parent;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> childComponents;
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
        //添加对父组件的引用
        child.setParent(this);
    }

    @Override
    void printStruct(String preStr) {
        System.out.println(preStr + "+" + this.name);
        //看有没有子组件
        if (childComponents != null) {
            preStr += " ";
            for (Component c :
                    childComponents) {
                c.printStruct(preStr);
            }
        }
    }

    @Override
    public List<Component> getChildren() {
        return childComponents;
    }

    @Override
    void removeChild(Component child) {
        if (childComponents != null) {
            int idx = childComponents.indexOf(child);
            if (idx != -1) {
                //把被删除对象的子组件直接设置为本对象的子组件
                for (Component c :
                        child.getChildren()) {
                    c.setParent(this);
                    childComponents.add(c);
                }
                //删除对应元素
                childComponents.remove(idx);
            }
        }
    }

    @Override
    Component getChildren(int index) {
        return childComponents.get(index);
    }
}
