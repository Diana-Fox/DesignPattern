package observer.publish_subscribe;

public class Reader implements Observer {
    //读者姓名
    private String name;

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到报纸了，" +
                "订阅内容为："+((NewsPaper)subject).getContent()+",这是拉模型，" +
                "观察者主动拉取目标堆栈的相关值");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
