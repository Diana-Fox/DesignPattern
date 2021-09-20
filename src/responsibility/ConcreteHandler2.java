package responsibility;

public class ConcreteHandler2 extends Handler {
    boolean someCondition = true;

    @Override
    public void handleRequest() {
        if (someCondition) {
            System.out.println("ConcreteHandler2 handle request");
        } else {
            if (successor != null) {
                successor.handleRequest();
            }
        }
    }
}
