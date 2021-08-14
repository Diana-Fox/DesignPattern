package abstract_factory.dao.factory.impl;

import abstract_factory.dao.dao.impl.XmlOrderDetail;
import abstract_factory.dao.dao.impl.XmlOrderMain;
import abstract_factory.dao.factory.DAOFactory;
import abstract_factory.dao.dao.OrderDetailDao;
import abstract_factory.dao.dao.OrderMainDao;

public class XmlDAOFactory implements DAOFactory {
    @Override
    public OrderMainDao createOrderMainDAO() {
        return new XmlOrderMain();
    }

    @Override
    public OrderDetailDao createDetailDAO() {
        return new XmlOrderDetail();
    }
}
