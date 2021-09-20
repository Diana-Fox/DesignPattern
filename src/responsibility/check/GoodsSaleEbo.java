package responsibility.check;

public class GoodsSaleEbo {
    /**
     * 保存销售信息
     *
     * @param user
     * @param customer
     * @param saleModel
     * @return
     */
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //权限检查
        SaleSecurityCheck ssc = new SaleSecurityCheck();
        //通用数据检查
        SaleDataCheck sdc = new SaleDataCheck();
        //数据逻辑校验
        SaleLogicCheck slc = new SaleLogicCheck();
        SaleManager sd = new SaleManager();
        ssc.setSuccessor(sdc);
        sdc.setSuccessor(slc);
        slc.setSuccessor(sd);
        return ssc.sale(user, customer, saleModel);
    }
}
