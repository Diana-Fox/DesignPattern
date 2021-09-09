package memento.to_prototype;

public class Client {
    public static void main(String[] args) {
        FlowAMockPrototype mock = new FlowAMockPrototype("Test");
        mock.runPhaseOne();

        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
        FlowAMockMemento memento = mock.createMemento();
        careTaker.saveMemento(memento);

        mock.schema1();
        mock.setMemento(careTaker.retrieveMemento());

        mock.schema2();
    }
}
