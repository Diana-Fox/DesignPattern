package factory_method.parameter;

/**
 * 具体的创建器对象，覆盖实现Creator定义的工厂方法，返回具体Product实例
 */
public class ConcreteCreator extends Creator {
    @Override
    protected Product factoryMethod() {
        //返回具体子类
        return new ConcreteProduct();
    }
}
