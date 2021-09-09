package memento;

/**
 * 负责保存备忘录的对象
 */
public class Caretaker {
    private Memento memento;

    public Memento retrieveMemento() {
        return memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
