package command.queue_command;


public interface Command {
    void execute();

    //设置接收者
    void setCookApi(CookApi cookApi);

    //返回发起请求的桌号
    int getTableNum();
}
