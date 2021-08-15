package generator.export_File;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器的具体实现
 */
public class XmlBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId() + "," + ehm.getExportDate() + "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName :
                mapData.keySet()) {
            //只是示范一下，不是标准xml格式
            buffer.append("<xml>"+tblName + "<xml>");
            for (ExportDataModel edm :
                    mapData.get(tblName)) {
                buffer.append("<xml>"+
                        edm.getProductId() + "," +
                                edm.getProductId() + "," + edm.getAmount() + "<xml>");
            }
        }
    }

    @Override
    public void buildFooter(ExportFootModel exportFootModel) {
        buffer.append("<xml>"+exportFootModel.getExportUser()+"<xml>");
    }

    @Override
    public StringBuffer getResult() {
        return buffer;
    }
}
