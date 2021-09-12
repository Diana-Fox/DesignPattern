package Flyweight.unshared;

public class AuthorizationFlyweight implements Flyweight {
    //内部状态，安全实体
    private String securityEntity;
    //内部状态，权限
    private String permit;

    public AuthorizationFlyweight(String state) {
        String[] split = state.split(",");
        this.securityEntity = split[0];
        this.permit = split[1];
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

    @Override
    public void add(Flyweight f) {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }
}
