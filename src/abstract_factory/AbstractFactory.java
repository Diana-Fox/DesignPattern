package abstract_factory;

/**
 * 抽象工厂，定义创建一系列产品对象的操作接口
 */
public interface AbstractFactory {
    //创建产品A
    AbstractProductA createProductA();
    //创建产品B
    AbstractProductB createProductB();
}
