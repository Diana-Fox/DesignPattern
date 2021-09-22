package visitor.manager;

/**
 * 具体的访问者，实现客户提出服务请求的功能
 */
public class ServiceRequestVisitor implements Visitor {

    @Override
    public void visitEnterpriseCustomer(EnterpriseCustomer customer) {
        System.out.println(customer.getName() + "企业提出服务请求");
    }

    @Override
    public void visitPersonalCustomer(PersonalCustomer pc) {
        System.out.println("客户" + pc.getName() + "提出服务请求");

    }
}
