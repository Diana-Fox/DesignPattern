package prototype.deep_clone;

import prototype.order.OrderApi;

/**
 * 个人订单
 */
public class PersonalOrder implements OrderApi {
    private String customerName;
    private String productId;
    private Product product;
    private int orderProductNum = 0;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public OrderApi cloneOrder() {
        PersonalOrder order = new PersonalOrder();
        order.setCustomerName(this.customerName);
        order.setProductId(this.productId);
        order.setOrderProductNum(this.orderProductNum);
        order.setProduct((Product) this.product.cloneProduct());
        return order;
    }
}
