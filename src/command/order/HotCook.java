package command.order;

/**
 * 热菜师傅
 */
public class HotCook implements CookApi {
    @Override
    public void cook(String name) {
        System.out.println("热菜厨师正在做"+name);
    }
}
