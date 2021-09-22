package visitor.manager;

/**
 * 具体的访问者，实现对客户价值分析的功能
 */
public class WorthAnalyzeVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer customer) {
        System.out.println("对企业客户" + customer.getName() + "进行价值分析");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("对个人客户" + pc.getName() + "进行价值分析");

    }
}
