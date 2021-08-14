package abstract_factory.dao.dao.impl;

import abstract_factory.dao.dao.OrderDetailDao;

public class XmlOrderDetail implements OrderDetailDao {
    @Override
    public void CreateDetail() {
        System.out.println("xml中创建主订单");
    }
}
