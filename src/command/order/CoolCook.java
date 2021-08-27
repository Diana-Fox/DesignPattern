package command.order;

public class CoolCook implements CookApi{
    @Override
    public void cook(String name) {
        System.out.println("凉菜厨师正在做"+name);
    }
}
