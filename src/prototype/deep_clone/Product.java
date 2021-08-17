package prototype.deep_clone;

/**
 * 产品对象
 */
public class Product implements ProductPrototype {
    //产品编号
    private String productId;
    //产品名称
    private String name;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ProductPrototype cloneProduct() {
        Product product = new Product();
        product.setName(this.name);
        product.setProductId(this.productId);
        return product;
    }
}
