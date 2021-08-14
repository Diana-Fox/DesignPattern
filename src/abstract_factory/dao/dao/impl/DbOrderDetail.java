package abstract_factory.dao.dao.impl;

import abstract_factory.dao.dao.OrderDetailDao;

public class DbOrderDetail implements OrderDetailDao {
    @Override
    public void CreateDetail() {
        System.out.println("db中创建主订单");
    }
}
