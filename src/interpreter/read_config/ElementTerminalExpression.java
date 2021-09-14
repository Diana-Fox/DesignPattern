package interpreter.read_config;

import org.w3c.dom.Element;

/**
 * 元素作为终结符对应的解释器
 */
public class ElementTerminalExpression extends ReadXmlExpression {
    //元素名字
    private String eleName = "";

    public ElementTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context cxt) {
        Element preEle = cxt.getPreEle();
        Element ele = null;
        if (preEle == null) {
            ele = cxt.getDocument().getDocumentElement();
        } else {
            ele = cxt.getNowEle(preEle, eleName);
            cxt.setPreEle(ele);
        }
        String[] ss = new String[1];
        ss[0] = ele.getFirstChild().getNodeValue();
        return ss;
    }
}
