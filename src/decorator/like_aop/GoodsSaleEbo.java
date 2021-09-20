package decorator.like_aop;

public class GoodsSaleEbo implements GoodsSaleEbi {
    @Override
    public boolean sale(String user, String customer, SaleMode saleMode) {
        System.out.println(user + "保存了" + customer + "购买" + saleMode + "的销售数据");
        return true;
    }
}
