package abstract_factory.dao.factory;

import abstract_factory.dao.dao.OrderDetailDao;
import abstract_factory.dao.dao.OrderMainDao;

public interface DAOFactory {
    //创建主订单DAO对象
    OrderMainDao createOrderMainDAO();
    //创建子订单DAO对象
    OrderDetailDao createDetailDAO();
}
