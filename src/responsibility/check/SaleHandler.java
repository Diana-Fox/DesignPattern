package responsibility.check;

/**
 * 定义职责对象的接口
 */
public abstract class SaleHandler {
    protected SaleHandler successor = null;

    public void setSuccessor(SaleHandler successor) {
        this.successor = successor;
    }

    public abstract boolean sale(String user,String customer,SaleModel saleModel);
}
