package observer.push_model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    /**
     * 用来保存注册的观察者对象，也就是报纸的订阅者
     */
    private List<Observer> readers = new ArrayList<>();

    /**
     * 注册订阅
     *
     * @param reader
     */
    public void attach(Observer reader) {
        readers.add(reader);
    }

    /**
     * 取消订阅
     *
     * @param reader
     */
    public void detach(Observer reader) {
        readers.remove(reader);
    }

    /**
     * 推送通知
     */
    public void notifyObservers(String content) {
        for (Observer reader :
                readers) {
            reader.update(content);
        }

    }
}
