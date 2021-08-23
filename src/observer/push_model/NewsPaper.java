package observer.push_model;

public class NewsPaper extends Subject {
    /**
     * 报纸的具体内容
     */
    private String content;

    public void setContent(String content) {
        this.content = content;
        //通知一下
        notifyObservers(content);
    }

    public String getContent() {
        return content;
    }
}
