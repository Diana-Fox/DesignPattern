package generator.export_File;

import java.util.Collection;
import java.util.Map;

/**
 * 指导者，用来使用Builder接口，以一个统一的过程来构建所需要的Product对象
 */
public class Director {
    //一个构建对象
    private Builder builder;

    //传入构建对象
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel ehm,
                          Map<String, Collection<ExportDataModel>> mapData, ExportFootModel eft) {
        builder.buildHeader(ehm);
        builder.buildBody(mapData);
        builder.buildFooter(eft);
    }
}
