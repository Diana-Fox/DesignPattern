package observer.observable;


import java.util.Observable;

public class NewsPaper extends Observable {
    /**
     * 报纸的具体内容
     */
    private String content;

    public void setContent(String content) {
        this.content = content;
        //因为使用Java中的Observer模式的时候，必需有这句,标识状态已经改变
        this.setChanged();
        //这样调用一下，则只存在拉模式
        this.notifyObservers();
        //推模式
        this.notifyObservers(this.content);

    }

    public String getContent() {
        return content;
    }
}
