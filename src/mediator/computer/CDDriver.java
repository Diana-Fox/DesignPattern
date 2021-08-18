package mediator.computer;


public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }

    //光驱读取出来的数据
    private String data = "";

    //获取光驱读取出来的数据
    public String getData() {
        return data;
    }

    //读取光盘
    public void readCD() {
        //假装逗号前是视频，逗号后是声音
        this.data = "学习设计模式，变得更强";
        //通知主板，状态发生了变化
        this.getMediator().changed(this);
    }
}
