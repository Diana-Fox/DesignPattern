package prototype;

/**
 * 使用原型的客户端
 */
public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;

    public Client(Prototype prototype) {
        this.prototype = prototype;
    }

    public void operation() {
        //会需要创建原型接口的对象
        Prototype clone = prototype.clone();
    }
}
