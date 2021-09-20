package bridge.msg;

/**
 * 加急消息
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急:" + message;
        super.sendMessage(message, toUser);
    }

    /**
     * 监控某消息的处理过程
     *
     * @param messageId 被监控消息的编号
     * @return 监控到的数据对象，这里简单示意
     */
    public Object watch(String messageId) {
        return null;
    }
}
