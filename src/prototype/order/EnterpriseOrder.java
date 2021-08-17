package prototype.order;

/**
 * 个人订单
 */
public class EnterpriseOrder implements OrderApi {
    private String EnterpriseName;
    private String productId;
    private int orderProductNum = 0;

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        EnterpriseName = enterpriseName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public int getOrderProductNum() {
        return orderProductNum;
    }

    @Override
    public void setOrderProductNum(int orderProductNum) {
        this.orderProductNum = orderProductNum;
    }

    @Override
    public OrderApi cloneOrder() {
        EnterpriseOrder order = new EnterpriseOrder();
        order.setEnterpriseName(this.EnterpriseName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);
        return order;
    }
}
