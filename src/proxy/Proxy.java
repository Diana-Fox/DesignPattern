package proxy;

/**
 * 实现了和目标对象相同的接口，持有目标对象的引用，可以控制目标对象的功能
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        //做一些处理
        realSubject.request();
        //做一些处理
    }
}
