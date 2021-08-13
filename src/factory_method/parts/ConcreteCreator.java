package factory_method.parts;

/**
 * 具体的创建器对象，覆盖实现Creator定义的工厂方法，返回具体Product实例
 */
public class ConcreteCreator extends Creator {

    @Override
    protected ConcreteProduct1 factoryMethod1() {
        return null;
    }

    @Override
    protected ConcreteProduct2 factoryMethod2() {
        return null;
    }
}
