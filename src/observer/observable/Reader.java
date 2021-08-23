package observer.observable;


import java.util.Observable;
import java.util.Observer;

/**
 * 直接实现Java自带的util.Observer
 */
public class Reader implements Observer {
    //读者姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 同时支持推模型和拉模型
     * @param o 拉模型所需的对象
     * @param arg 推模型所需的数据
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name+"收到报纸了，目标推送过来的是:"+arg);
        System.out.println(name+"收到报纸了，目标拉取的是:"+((NewsPaper)o).getContent());
    }
}
