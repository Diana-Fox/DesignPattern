package responsibility.check;

public class Client {
    public static void main(String[] args) {
        GoodsSaleEbo ebo = new GoodsSaleEbo();
        SaleModel saleModel = new SaleModel();
        saleModel.setGoods("手机");
        saleModel.setSaleNum(10);

        ebo.sale("小宝","含章",saleModel);
        ebo.sale("宝宝","含章",saleModel);
    }
}
