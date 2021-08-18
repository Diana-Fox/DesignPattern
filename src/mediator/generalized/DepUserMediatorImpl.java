package mediator.generalized;

import java.util.ArrayList;
import java.util.Collection;

public class DepUserMediatorImpl {
    private static DepUserMediatorImpl mediator = new DepUserMediatorImpl();

    private DepUserMediatorImpl() {
        initTestData();
    }

    public static DepUserMediatorImpl getInstance() {
        return mediator;
    }

    private Collection<DepUserModel> depUserCol = new ArrayList<>();

    /**
     * 初始化测试数据
     */
    private void initTestData() {
        DepUserModel dum1 = new DepUserModel();
        dum1.setDepUserId("dum1");
        dum1.setDepId("d1");
        dum1.setUserId("u1");
        depUserCol.add(dum1);
        DepUserModel dum2 = new DepUserModel();
        dum2.setDepUserId("dum2");
        dum2.setDepId("d1");
        dum2.setUserId("u2");
        depUserCol.add(dum2);
        DepUserModel dum3 = new DepUserModel();
        dum3.setDepUserId("dum3");
        dum3.setDepId("d2");
        dum3.setUserId("u3");
        depUserCol.add(dum3);
        DepUserModel dum4 = new DepUserModel();
        dum4.setDepUserId("dum4");
        dum4.setDepId("d2");
        dum4.setUserId("u4");
        depUserCol.add(dum4);
        DepUserModel dum5 = new DepUserModel();
        dum5.setDepUserId("dum5");
        dum5.setDepId("d2");
        dum5.setUserId("u1");
        depUserCol.add(dum5);
    }

    //部门撤销
    public boolean deleteDep(String depId) {
        Collection<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du :depUserCol) {
            if (du.getDepId().equals(depId)) {
                //找到的所有符合条件的
                tempCol.add(du);
            }
        }
        //去掉所有
        depUserCol.removeAll(tempCol);
        return true;
    }

    public boolean deleteUser(String userId) {
        Collection<DepUserModel> tempCol = new ArrayList<>();
        for (DepUserModel du :
                depUserCol) {
            if (du.getDepId().equals(userId)) {
                //找到的所有符合条件的
                tempCol.add(du);
            }
        }
        //去掉所有
        depUserCol.removeAll(tempCol);
        return true;
    }

    /**
     * 测试使用，打印部门下所有成员
     *
     * @param dep
     */
    public void showDepUsers(Dep dep) {
        for (DepUserModel du :
                depUserCol) {
            if (du.getDepId().equals(dep.getDepId())) {
                System.out.println("部门编号：" + dep.getDepId() + ",人员：" + du.getUserId());
            }
        }
    }

    //打印这个人所需的部门
    public void showUserDeps(User user) {
        for (DepUserModel du :depUserCol) {
            if (du.getUserId().equals(user.getUserId())) {
                System.out.println("人员编号：" + user.getUserId() +
                        ",属于部门编号：" + du.getDepId());
            }
        }
    }

}
