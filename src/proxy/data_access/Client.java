package proxy.data_access;

import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Collection<UserModelApi> col = userManager.getUserByDepId("0101");
        for (UserModelApi umApi :
                col) {
            System.out.println("用户编号：" + umApi.getUserId() + ",用户姓名：" + umApi.getName());
        }
        //如果访问其他属性，会重新查询数据库
        for (UserModelApi umApi :
                col) {
            System.out.println("用户编号：" + umApi.getUserId() +
                    ",用户姓名：" + umApi.getName()
                    + "所属部门编号：" + umApi.getDepId());
        }
    }
}
