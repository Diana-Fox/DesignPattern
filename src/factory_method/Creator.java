package factory_method;

/**
 * 创建器，声明工厂方法
 */
public abstract class Creator {
    /**
     * 工厂方法不对外暴露
     *
     * @return
     */
    protected abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.myProduct();
    }
}
