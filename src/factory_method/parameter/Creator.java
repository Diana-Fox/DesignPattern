package factory_method.parameter;

/**
 * 创建器，声明工厂方法
 */
public abstract class Creator {
    //通过Creator创建出来的
    public Parameter createParameter(String name) {
        return new Parameter(name, factoryMethod());
    }

    /**
     * @return
     */
    protected abstract Product factoryMethod();

    public void someOperation() {
        Product product = factoryMethod();
        product.myProduct();
    }
}
