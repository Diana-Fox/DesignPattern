package observer.quality;

import java.util.ArrayList;
import java.util.List;

public abstract class WaterQualitySubject {
    protected List<WaterObserver> observers = new ArrayList<>();

    public void attach(WaterObserver observer) {
        observers.add(observer);
    }

    public void detach(WaterObserver observer) {
        observers.remove(observer);
    }

    /**
     * 通知相应的观察者对象
     */
    public abstract void notifyWatchers();

    /**
     * 获取水质污染的级别
     * @return
     */
    public abstract int getPolluteLevel();
}
