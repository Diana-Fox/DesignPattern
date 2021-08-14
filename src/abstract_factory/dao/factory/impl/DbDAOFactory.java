package abstract_factory.dao.factory.impl;

import abstract_factory.dao.dao.impl.DbOrderDetail;
import abstract_factory.dao.dao.impl.DbOrderMain;
import abstract_factory.dao.factory.DAOFactory;
import abstract_factory.dao.dao.OrderDetailDao;
import abstract_factory.dao.dao.OrderMainDao;

public class DbDAOFactory implements DAOFactory {
    @Override
    public OrderMainDao createOrderMainDAO() {
        return new DbOrderMain();
    }

    @Override
    public OrderDetailDao createDetailDAO() {
        return new DbOrderDetail();
    }
}
