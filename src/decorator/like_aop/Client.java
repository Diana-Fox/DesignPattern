package decorator.like_aop;

public class Client {
    public static void main(String[] args) {
        GoodsSaleEbi ebi = new CheckDecorator(new LogDecorator(new GoodsSaleEbo()));
        SaleMode saleMode = new SaleMode();
        saleMode.setSaleNum(10);
        saleMode.setGoods("手机");
        ebi.sale("小宝", "娉婷", saleMode);
        ebi.sale("宝宝", "娉婷", saleMode);

    }
}
