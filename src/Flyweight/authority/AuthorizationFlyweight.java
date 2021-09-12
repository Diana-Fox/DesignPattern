package Flyweight.authority;

/**
 * 封装授权数据中重复出现部分的享元对象
 */
public class AuthorizationFlyweight implements Flyweight {
    /**
     * 内部状态，安全实体
     */
    private String securityEntity;

    /**
     * 内部状态，权限
     */
    private String permit;

    /**
     * @param state 状态数据，包含安全实体和权限的数据，用逗号分割
     */
    public AuthorizationFlyweight(String state) {
        String[] split = state.split(",");
        securityEntity = split[0];
        permit = split[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        if (this.securityEntity.equals(securityEntity)
                && this.permit.equals(permit))
            return true;
        return false;
    }
}
