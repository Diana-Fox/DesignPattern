package visitor.combine;


import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象的相应方法
        visitor.visitorComposite(this);
        //循环子元素，让子元素也接受访问
        for (Component c :
                childComponents) {
            c.accept(visitor);
        }
    }

    //用来存储组合对象中包含的子组件对象
    private List<Component> childComponents = new ArrayList<>();
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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
