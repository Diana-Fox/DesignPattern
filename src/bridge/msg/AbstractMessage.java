package bridge.msg;

/**
 * 抽象的消息对象
 */
public abstract class AbstractMessage {
    /**
     * 持有一个实现部分的对象
     */
    protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    /**
     * 发送消息，调用具体实现
     *
     * @param message
     * @param toUser
     */
    public void sendMessage(String message, String toUser) {
        impl.send(message, toUser);
    }
}
