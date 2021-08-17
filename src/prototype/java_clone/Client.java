package prototype.java_clone;


public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        PersonalOrder personalOrder = new PersonalOrder();
        personalOrder.setOrderProductNum(2000);
        personalOrder.setCustomerName("小宝");
        personalOrder.setProductId("001");
        PersonalOrder clone = (PersonalOrder)personalOrder.clone();

    }
}
