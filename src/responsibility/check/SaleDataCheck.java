package responsibility.check;

public class SaleDataCheck extends SaleHandler {
    @Override
    public boolean sale(String user, String customer, SaleModel saleModel) {
        if (user == null || user.trim().length() == 0) {
            System.out.println("申请人不能为空");
            return false;
        }
        if (customer == null || customer.trim().length() == 0) {
            System.out.println("客户不能为空");
            return false;
        }
        if (saleModel == null) {
            System.out.println("销售商品的数据不能为空");
            return false;
        }
        if (saleModel.getGoods() == null || saleModel.getGoods().length() == 0) {
            System.out.println("商品名称不能为空");
            return false;
        }
        if (saleModel.getSaleNum() == 0) {
            System.out.println("商品数量不能为空");
            return false;
        }
        return successor.sale(user, customer, saleModel);
    }
}
