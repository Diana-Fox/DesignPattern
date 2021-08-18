package mediator;

public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void someOperation() {
        //需要跟其他同事通信，通知中介者
        getMediator().changed(this);
    }
}
