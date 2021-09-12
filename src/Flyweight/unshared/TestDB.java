package Flyweight.unshared;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class TestDB {
    //存放单独授权数据的值
    public static Collection<String> colDB = new ArrayList<>();
    //存放组合授权数据
    public static Map<String, String[]> mapDB = new HashMap<>();

    static {
        colDB.add("小宝,人员列表,查看,1");
        colDB.add("宝宝,人员列表,查看,1");
        colDB.add("宝宝,操作薪资数据,,2");
        mapDB.put("操作薪资数据", new String[]{"薪资数据,查看", "薪资数据,修改"});

        for (int i = 0; i < 3; i++) {
            colDB.add("小宝" + i + ",人员列表,查看,1");
        }
    }
}
