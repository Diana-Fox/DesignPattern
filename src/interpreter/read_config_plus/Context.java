package interpreter.read_config_plus;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

/**
 * 上下文对象，用来包含解释器需要的一些全局信息
 */
public class Context {
    //上一个被处理的多个元素
    private List<Element> preEles = new ArrayList<>();
    //Dom解析Xml的Document对象
    private Document document;

    //文件结构
    public Context(String filePathName) throws Exception {
        this.document = XmlUtil.getRoot(filePathName);
    }

    /**
     * 重新初始化上下文
     */
    public void reInit() {
        preEles = new ArrayList<>();
    }

    /**
     * 各个Expression公共使用的方法
     * 根据父元素和当前元素的名称来获取当前元素
     *
     * @param pEle    父元素
     * @param eleName 当前元素名称
     * @return 找到的当前元素
     */
    public List<Element> getNowEle(Element pEle, String eleName) {
        List<Element> elements = new ArrayList<>();
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    elements.add(nowEle);
                }
            }
        }
        return elements;
    }

    public List<Element> getPreEles() {
        return preEles;
    }

    public void setPreEles(List<Element> preEles) {
        this.preEles = preEles;
    }

    public Document getDocument() {
        return document;
    }

}
