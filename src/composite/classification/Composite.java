package composite.classification;

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

}
