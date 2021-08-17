package prototype.deep_clone;

/**
 * 订单接口
 */
public interface OrderApi {
    int getOrderProductNum();

    void setOrderProductNum(int num);

    OrderApi cloneOrder();
}
