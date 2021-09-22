package visitor.combine_plus;


import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    @Override
    public void accept(Visitor visitor) {
       visitor.visitorComposite(this);
    }

    //用来存储组合对象中包含的子组件对象
    private List<Component> childComponents = new ArrayList<>();

    public List<Component> getChildComponents() {
        return childComponents;
    }

    /**
     * 组合对象的名字
     */
    private String name = "";

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public void addChild(Component child) {
        childComponents.add(child);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
