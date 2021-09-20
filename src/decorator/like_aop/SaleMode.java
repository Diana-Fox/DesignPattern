package decorator.like_aop;

/**
 * 封装销售数据
 */
public class SaleMode {
    /**
     * 销售的商品
     */
    private String goods;
    /**
     * 销售的数量
     */
    private int saleNum;

    public String getGoods() {
        return goods;
    }

    public void setGoods(String goods) {
        this.goods = goods;
    }

    public int getSaleNum() {
        return saleNum;
    }

    public void setSaleNum(int saleNum) {
        this.saleNum = saleNum;
    }

    @Override
    public String toString() {
        return "SaleMode{" +
                "goods='" + goods + '\'' +
                ", saleNum=" + saleNum +
                '}';
    }
}
