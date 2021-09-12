package Flyweight.unshared;

public interface Flyweight {
    /**
     * 判断传入的安全实体和权限，是否和享元对象内部状态匹配
     *
     * @param securityEntity
     * @param permit
     * @return
     */
    boolean match(String securityEntity, String permit);

    /**
     * 为flyweight添加子flyweight
     *
     * @param f
     */
    void add(Flyweight f);

}
