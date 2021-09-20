package bridge.msg;

/**
 * 普通消息
 */
public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        //普通消息，什么都不做，直接调用父类即可
        super.sendMessage(message, toUser);
    }
}
