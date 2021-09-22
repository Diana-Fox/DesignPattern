package visitor.manager;

/**
 * 访问者接口
 */
public interface Visitor {
    /**
     * 访问企业客户，相当于给企业客户添加访问者的功能
     *
     * @param ce
     */
    void visitEnterpriseCustomer(EnterpriseCustomer ce);

    /**
     * 访问个人用户，相当于给个人客户添加访问者的功能
     *
     * @param pc
     */
    void visitPersonalCustomer(PersonalCustomer pc);
}
