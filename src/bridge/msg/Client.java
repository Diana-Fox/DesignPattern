package bridge.msg;


public class Client {
    public static void main(String[] args) {
        MessageImplementor impl1 = new MessageSMS();
        AbstractMessage am = new CommonMessage(impl1);
        am.sendMessage("我失眠了", "於菟");

        am = new UrgencyMessage(impl1);
        am.sendMessage("我为什么失眠了", "於菟");

        impl1 = new MessageEmail();
        am = new CommonMessage(impl1);
        am.sendMessage("我失眠了", "於菟");

        am = new UrgencyMessage(impl1);
        am.sendMessage("我为什么失眠了", "於菟");

        am = new SpecialUrgencyMessage(impl1);
        am.sendMessage("我为什么失眠了", "於菟");

        impl1 = new MessageMobile();
        am = new CommonMessage(impl1);
        am.sendMessage("天都亮了", "长乐");
        am = new UrgencyMessage(impl1);
        am.sendMessage("天都亮了", "长乐");
        am = new SpecialUrgencyMessage(impl1);
        am.sendMessage("天都亮了", "长乐");
    }
}
