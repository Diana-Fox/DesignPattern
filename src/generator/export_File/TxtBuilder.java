package generator.export_File;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器的具体实现
 */
public class TxtBuilder implements Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void buildHeader(ExportHeaderModel ehm) {
        buffer.append(ehm.getDepId() + "," + ehm.getExportDate()+ "\n");
    }

    @Override
    public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
        for (String tblName :
                mapData.keySet()) {
            buffer.append(tblName + "\n");
            for (ExportDataModel edm :
                    mapData.get(tblName)) {
                buffer.append(
                        edm.getProductId() + "," +
                                edm.getProductId() + "," + edm.getAmount()+"\n");
            }
        }
    }

    @Override
    public void buildFooter(ExportFootModel exportFootModel) {
        buffer.append(exportFootModel.getExportUser());
    }
    @Override
    public  StringBuffer getResult(){
        return buffer;
    }
}
