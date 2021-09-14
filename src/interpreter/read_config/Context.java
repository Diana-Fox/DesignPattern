package interpreter.read_config;

import org.w3c.dom.Document;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/**
 * 上下文对象，用来包含解释器需要的一些全局信息
 */
public class Context {
    //上一个被处理的元素
    private Element preEle;
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
        preEle = null;
    }

    /**
     * 各个Expression公共使用的方法
     * 根据父元素和当前元素的名称来获取当前元素
     *
     * @param pEle    父元素
     * @param eleName 当前元素名称
     * @return 找到的当前元素
     */
    public Element getNowEle(Element pEle, String eleName) {
        NodeList childNodes = pEle.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            if (childNodes.item(i) instanceof Element) {
                Element item = (Element) childNodes.item(i);
                if (item.getTagName().equals(eleName)) {
                    return item;
                }
            }
        }
        return null;
    }

    public Element getPreEle() {
        return preEle;
    }

    public void setPreEle(Element preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }

}
