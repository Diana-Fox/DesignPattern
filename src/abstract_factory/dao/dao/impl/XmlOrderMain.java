package abstract_factory.dao.dao.impl;

import abstract_factory.dao.dao.OrderMainDao;

public class XmlOrderMain implements OrderMainDao {
    @Override
    public void CreateMain() {
        System.out.println("xml中创建子订单");
    }
}
