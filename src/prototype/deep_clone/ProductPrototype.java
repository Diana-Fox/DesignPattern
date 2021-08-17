package prototype.deep_clone;

/**
 * 克隆接口
 */
public interface ProductPrototype {
    /**
     * 从自身克隆一个产品对象
     * @return
     */
    public ProductPrototype cloneProduct();
}
