package decorator.like_aop;

public class CheckDecorator extends Decorator {

    public CheckDecorator(GoodsSaleEbi ebi) {
        super(ebi);
    }

    @Override
    public boolean sale(String user, String customer, SaleMode saleMode) {
        if (!"小宝".equals(user)) {
            System.out.println("对不起"+user+"，没有权限保存销售单");
            return false;
        } else {
            return ebi.sale(user, customer, saleMode);
        }
    }
}
