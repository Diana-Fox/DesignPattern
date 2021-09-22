package visitor.manager;

public class PersonalCustomer extends Customer {
    private String telephone;
    private int age;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void accept(Visitor visitor) {
        //回调访问者对象
        visitor.visitPersonalCustomer(this);
    }
}
