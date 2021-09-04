package template_method.crud;

import java.util.Collection;

public class Client {
    public static void main(String[] args) {
        UserJDBC uj = new UserJDBC();
        UserModel um1 = new UserModel();
        um1.setUuid("u1");
        um1.setName("小宝 ");
        um1.setAge(22);
        uj.create(um1);

        UserModel um2 = new UserModel();
        um2.setUuid("u2");
        um2.setName("宝宝 ");
        um2.setAge(25);
        uj.create(um2);

        UserModel um3 = new UserModel();
        um3.setUuid("u3");
        um3.setName("宝儿 ");
        um3.setAge(32);
        uj.create(um3);

        um3.setName("宝儿姐姐");
        um3.setAge(30);
        uj.update(um3);

        UserQueryModel uqm = new UserQueryModel();
        uqm.setName("宝儿%");
        uqm.setAge(25);
        uqm.setAge2(35);
        Collection<UserModel> condition = uj.getByCondition(uqm);

        for (UserModel tempUm :
                condition) {
            System.out.println(tempUm);
        }
    }
}
