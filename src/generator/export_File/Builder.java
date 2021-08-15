package generator.export_File;

import java.util.Collection;
import java.util.Map;

/**
 * 生成器接口
 */
public interface Builder {
    void buildHeader(ExportHeaderModel ehm);

    void buildBody(Map<String, Collection<ExportDataModel>> mapData);

    void buildFooter(ExportFootModel exportFootModel);

    StringBuffer getResult();
}
