package visitor.manager;

public class EnterpriseCustomer extends Customer {
    //联系人
    private String linkman;
    //联系电话
    private String linkTelephone;
    //企业注册地址
    private String registerAddress;

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getLinkTelephone() {
        return linkTelephone;
    }

    public void setLinkTelephone(String linkTelephone) {
        this.linkTelephone = linkTelephone;
    }

    public String getRegisterAddress() {
        return registerAddress;
    }

    public void setRegisterAddress(String registerAddress) {
        this.registerAddress = registerAddress;
    }

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象
        visitor.visitEnterpriseCustomer(this);
    }
}
