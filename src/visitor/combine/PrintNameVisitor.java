package visitor.combine;

public class PrintNameVisitor implements Visitor {
    @Override
    public void visitorComposite(Composite composite) {
        System.out.println("节点：" + composite.getName());
    }

    @Override
    public void visitorLeaf(Leaf leaf) {
        System.out.println("叶子：" + leaf.getName());
    }
}
