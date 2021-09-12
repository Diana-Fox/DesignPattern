package Flyweight.authority;

import java.util.ArrayList;
import java.util.Collection;

public class TestDB {
    public static Collection<String> colDB = new ArrayList<>();

    static {
        colDB.add("小宝,人员列表,查看");
        colDB.add("宝宝,人员列表,查看");
        colDB.add("宝宝,薪资数据,查看");
        colDB.add("宝宝,薪资数据,修改");
    }
}
