package proxy.dynamic_proxy;

public interface OrderApi {
    String getProductName();

    void setProductName(String productName, String user);

    int getOrderNum();

    void setOrderNum(int orderNum, String user);

    String getOrderUser();

    void setOrderUser(String orderUser, String user);

}
