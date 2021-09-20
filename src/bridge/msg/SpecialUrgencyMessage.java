package bridge.msg;

/**
 * 加急消息
 */
public class SpecialUrgencyMessage extends AbstractMessage {
    public SpecialUrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "特急:" + message;
        super.sendMessage(message, toUser);
        //需要增加一条待催促的信息
    }


    public void hurry(String messageId) {
        //一个催促处理的业务
    }
}
