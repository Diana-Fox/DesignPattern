package prototype.order;

public class Client {
    public static void main(String[] args) {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(2000);
        personalOrder.setCustomerName("小宝");
        personalOrder.setProductId("001");
        OrderBusiness orderBusiness = new OrderBusiness();
        orderBusiness.saveOrder(personalOrder);
        EnterpriseOrder enterpriseOrder = new EnterpriseOrder();
        enterpriseOrder.setOrderProductNum(2006);
        enterpriseOrder.setEnterpriseName("小宝有限公司");
        enterpriseOrder.setProductId("001");
        orderBusiness.saveOrder(enterpriseOrder);
    }
}
