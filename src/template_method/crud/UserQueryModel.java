package template_method.crud;

/**
 * 用户查询条件数据
 */
public class UserQueryModel extends UserModel {
    /**
     * 年龄是期间查询，定义age2做查询条件2
     */
    private int age2;

    public int getAge2() {
        return age2;
    }

    public void setAge2(int age2) {
        this.age2 = age2;
    }
}
