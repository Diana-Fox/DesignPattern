package composite.ringlike;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private String name;
    private List<Component> childComponents;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void printStruct(String preStr) {
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
    public void addChild(Component child) throws IllegalAccessException {
        if (childComponents == null) {
            childComponents = new ArrayList<>();
        }
        //如果没有路径
        if (this.getComponentPath().isEmpty()) {
            this.setComponentPath(this.name);
        }
        //先判断是否为根组件
        if (this.getComponentPath().startsWith(child.getName() + ".")) {
            throw new IllegalAccessException("在本通路上，组件" + child.getName() + "已经被添加过了");
        } else {
            //加入路径
            if (this.getComponentPath().indexOf(("." + child.getName())) < 0) {
                String s = this.getComponentPath() + "." + child.getName();
                child.setComponentPath(s);
                childComponents.add(child);
                System.out.println(name+"的路径有"+getComponentPath());
            } else {
                throw new IllegalAccessException("在本通路上，组件" + child.getName() + "已经被添加过了");
            }
        }
    }
}
