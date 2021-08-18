package mediator.generalized;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String userName;
    private List<Dep> deps = new ArrayList<>();

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Dep> getDeps() {
        return deps;
    }

    public void setDeps(List<Dep> deps) {
        this.deps = deps;
    }
    //人员离职
    public boolean dimission(){
        DepUserMediatorImpl instance = DepUserMediatorImpl.getInstance();
        instance.deleteUser(userId);
        //删除人员业务，一般也是假删除
        return  true;
    }
}
