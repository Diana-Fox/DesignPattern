package iterator.filter;

public class PayModel {
    private String name;
    private int pay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "PayModel{" +
                "name='" + name + '\'' +
                ", pay=" + pay +
                '}';
    }
}
