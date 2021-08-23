package observer.push_model;

public class Reader implements Observer {
    //读者姓名
    private String name;

    @Override
    public void update(String content) {
        System.out.println(name + "收到报纸了，" +
                "订阅内容为：" + content+"。是推模型");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
