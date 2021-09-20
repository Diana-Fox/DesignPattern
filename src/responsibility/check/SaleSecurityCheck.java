package responsibility.check;

/**
 * 权限校验，是小宝就可以
 */
public class SaleSecurityCheck extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        if ("小宝".equals(user)) {
            return successor.sale(user, customer, saleModel);
        } else {
            System.out.println("对不起" + user + "，你没有权限保存销售信息。");
            return false;
        }
    }
}
