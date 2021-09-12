package Flyweight.gc;

public interface Flyweight {
    boolean match(String securityEntity, String permit);
    void add(Flyweight f);
}
