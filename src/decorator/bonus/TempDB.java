package decorator.bonus;

import iterator.ConcreteAggregate;

import java.util.HashMap;
import java.util.Map;

public class TempDB {
    public static Map<String, Double> mapMonthSaleMoney=new HashMap<>();
    static {
        mapMonthSaleMoney.put("小宝",10000.0);
        mapMonthSaleMoney.put("宝宝",20000.0);
        mapMonthSaleMoney.put("宝儿",30000.0);
    }
}
