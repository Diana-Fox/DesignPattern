package bridge.msg;

public class MessageMobile implements MessageImplementor{
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用手机短信的方式，发送消息'"+message+
                "'给"+toUser);
    }
}
