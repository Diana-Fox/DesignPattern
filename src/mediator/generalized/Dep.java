package mediator.generalized;

import java.util.ArrayList;
import java.util.List;

public class Dep {
    private String depId;
    private String depName;
    private List<User> users = new ArrayList<>();

    public String getDepId() {
        return depId;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public boolean deleteDep() {
        //先通过中介者清除掉所有与整个部门相关的部门和人员的关系
        DepUserMediatorImpl mediator = DepUserMediatorImpl.getInstance();
        mediator.deleteDep(depId);
        //真正的清除掉这个部门
        //通常是假删除
        return true;
    }
}
