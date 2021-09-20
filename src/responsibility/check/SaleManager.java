package responsibility.check;

/**
 * 真正的业务处理
 */
public class SaleManager extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        System.out.println(user + "保存了" + customer + "购买" + saleModel + "的销售数据");
        return true;
    }
}
