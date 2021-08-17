package prototype.manager;

public interface Prototype {
    Prototype clone();

    String getName();

    void setName(String name);
}
