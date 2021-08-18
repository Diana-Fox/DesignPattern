package mediator;

/**
 * 同事类接口
 */
public abstract class Colleague {
    //要持有中介类
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }
}
