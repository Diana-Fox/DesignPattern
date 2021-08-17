package prototype.deep_clone;

import prototype.order.OrderApi;

public class Client {
    public static void main(String[] args) {
        PersonalOrder order = new PersonalOrder();
        Product product = new Product();
        product.setProductId("123");
        product.setName("测试");
        order.setProduct(product);
        order.setCustomerName("小宝");
        order.setOrderProductNum(1243);
        System.out.println("对象还未克隆");
        PersonalOrder orderApi = (PersonalOrder) order.cloneOrder();
        Product product1 = orderApi.getProduct();
        System.out.println("深克隆后"+product1.getName()+"~~~");
    }
}
