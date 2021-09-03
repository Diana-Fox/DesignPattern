package composite;

import java.util.ArrayList;
import java.util.List;

//组合对象
public class Composite extends Component {
    //子组件对象
    private List<Component> childComponents;

    @Override
    void someOperation() {
        if (childComponents != null) {
            for (Component c :
                    childComponents) {
                c.someOperation();
            }
        }
    }

    @Override
    void addChild(Component child) {
        //延迟初始化
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        childComponents.add(child);
    }

    @Override
    void removeChild(Component child) {
        if (childComponents != null) {
            childComponents.remove(child);
        }
    }

    @Override
    Component getChildren(int index) {
      return childComponents.get(index);
    }
}
