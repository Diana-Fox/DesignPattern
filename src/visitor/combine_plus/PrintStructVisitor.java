package visitor.combine_plus;

/**
 * 新加功能
 * 实现输出组合对象自身的结果
 */
public class PrintStructVisitor implements Visitor {
    private String preStr = "";

    @Override
    public void visitorComposite(Composite composite) {
        System.out.println(preStr + "+" + composite.getName());
        if (composite.getChildComponents() != null) {
            preStr += " ";
            for (Component c :
                    composite.getChildComponents()) {
                c.accept(this);
            }
            preStr = preStr.substring(0, preStr.length() - 1);
        }
    }

    @Override
    public void visitorLeaf(Leaf leaf) {
        System.out.println(preStr + "-" + leaf.getName());
    }
}
