package proxy.dynamic_proxy;

public class Client {
    public static void main(String[] args) {
        Order order = new Order("设计模式", 100, "小宝");
        //创建一个动态代理对象
        DynamicProxy dynamicProxy = new DynamicProxy();
        //订单和代理对象关联
        OrderApi orderApi = dynamicProxy.getProxyInterface(order);
        //宝宝没有权限修改
        orderApi.setOrderNum(123, "宝宝");
        //小宝可以修改
        orderApi.setOrderNum(123, "小宝");

    }
}
