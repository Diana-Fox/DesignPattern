package decorator.like_aop;

/**
 * 装饰器接口
 */
public abstract class Decorator implements GoodsSaleEbi {
    /**
     * 持有被装饰的组件对象
     */
    protected GoodsSaleEbi ebi;

    public Decorator(GoodsSaleEbi ebi) {
        this.ebi = ebi;
    }
}
