package visitor.combine_plus;

/**
 * 在节点前加名字
 */
public class PrintNameVisitor implements Visitor {


    @Override
    public void visitorComposite(Composite composite) {
        composite.setName("节点：" + composite.getName());
        if (composite.getChildComponents() != null) {
            for (Component c :
                    composite.getChildComponents()) {
                c.accept(this);
            }
        }
    }

    @Override
    public void visitorLeaf(Leaf leaf) {
        leaf.setName("叶子：" + leaf.getName());
//        System.out.println("叶子：" + leaf.getName());
    }
}
