package decorator.like_aop;

/**
 * 商品销售管理的业务接口
 */
public interface GoodsSaleEbi {
    /**
     * 保存销售信息，销售数据应该是多条，简单演示
     *
     * @param user     操作人员
     * @param customer 客户
     * @param saleMode 销售数据
     * @return 是否保存成功
     */
    boolean sale(String user, String customer, SaleMode saleMode);
}
