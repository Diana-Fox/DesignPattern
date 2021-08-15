package generator.export_File;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        ExportHeaderModel ehm = new ExportHeaderModel();
        ehm.setExportDate("2021-08-14");
        ehm.setDepId("北京总公司");
        Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
        ArrayList<ExportDataModel> col = new ArrayList<>();
        //可以造多个，偷懒就不造了
        ExportDataModel edm = new ExportDataModel();
        edm.setAmount(123);
        edm.setPrice(321);
        edm.setProductId("产品001");
        col.add(edm);
        ExportFootModel efm = new ExportFootModel();
        efm.setExportUser("小宝");

        Builder txtBuilder = new TxtBuilder();
        Director director = new Director(txtBuilder);
        director.construct(ehm, mapData, efm);
        System.out.println("输出到文本文件："+txtBuilder.getResult());
        Builder xmlBuilder = new XmlBuilder();
        Director director1 = new Director(xmlBuilder);
        director1.construct(ehm,mapData,efm);
        System.out.println("输出到XML："+xmlBuilder.getResult());
    }
}
