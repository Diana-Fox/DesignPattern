package mediator;

/**
 * 具体的中介者实现对象
 */
public class ConcreteMediator implements Mediator {
    /**
     * 持有并维护同事A
     */
    private ConcreteColleagueA concreteColleagueA;
    /**
     * 持有并维护同事B
     */
    private ConcreteColleagueB concreteColleagueB;


    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }


    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    @Override
    public void changed(Colleague colleague) {
        //某个同事类发生了变化，通常需要与其他同事交互
        //具体协调相应的元素对象来实现协作行为
    }
}
