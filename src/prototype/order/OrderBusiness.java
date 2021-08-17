package prototype.order;

/**
 * 订单处理接口
 */
public class OrderBusiness {
    /**
     * 业务要求当订单预订的产品数量超过1000的时候，就需要把订单拆分成两份订单
     *
     * @param order
     */
    void saveOrder(OrderApi order) {
        while (order.getOrderProductNum() > 1000) {
            //拆分出一个新订单
            OrderApi newOrder = order.cloneOrder();
            newOrder.setOrderProductNum(1000);
            order.setOrderProductNum(order.getOrderProductNum()-1000);
            System.out.println("这里应该是业务功能，省略不写了"+newOrder);
        }
        //没超过
        System.out.println("订单处理"+order+",id="+order.getOrderProductNum());
    }
}
