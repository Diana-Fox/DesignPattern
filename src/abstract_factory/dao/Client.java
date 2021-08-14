package abstract_factory.dao;

import abstract_factory.dao.dao.OrderDetailDao;
import abstract_factory.dao.dao.OrderMainDao;
import abstract_factory.dao.factory.DAOFactory;
import abstract_factory.dao.factory.impl.DbDAOFactory;
import abstract_factory.dao.factory.impl.XmlDAOFactory;

public class Client {
    public static void main(String[] args) {
        //只需要修改创建工厂对象，无须改动其余代码，也可以使用简单工厂来选择
        //当使用XML创建工厂
        DAOFactory daoFactory = new XmlDAOFactory();
        //当使用DB创建工厂
        //DAOFactory daoFactory = new DbDAOFactory();
        OrderMainDao orderMainDAO = daoFactory.createOrderMainDAO();
        orderMainDAO.CreateMain();
        OrderDetailDao detailDAO = daoFactory.createDetailDAO();
        detailDAO.CreateDetail();

    }
}
