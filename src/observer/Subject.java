package observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //用来保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param observer
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer :
                observers) {
            observer.update(this);
        }
    }

}
