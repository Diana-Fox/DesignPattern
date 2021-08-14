package abstract_factory.dao.dao.impl;

import abstract_factory.dao.dao.OrderMainDao;

public class DbOrderMain implements OrderMainDao {
    @Override
    public void CreateMain() {
        System.out.println("db中创建子订单");
    }
}
