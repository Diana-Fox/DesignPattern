package responsibility;

public class ConcreteHandler1 extends Handler {
    //设置某些条件来判断是否属于自己的职责
    boolean someCondition = false;

    @Override
    public void handleRequest() {
        if (someCondition) {
            System.out.println("ConcreteHandler1 handle request");
        } else {
            if (successor != null) {
                successor.handleRequest();
            }
        }
    }
}
