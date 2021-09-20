package responsibility.check;

public class SaleLogicCheck extends SaleHandler {

    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        //一般可以看看数据是否符合逻辑，不过这里没啥好校验的
        return successor.sale(user, customer, saleModel);
    }
}
