package interpreter.read_config_plus;

import org.w3c.dom.Element;

import java.util.List;

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
        List<Element> preEles = cxt.getPreEles();
        Element ele = null;
        if (preEles.size() == 0) {
            //是根元素
            ele = cxt.getDocument().getDocumentElement();
        } else {
            ele = cxt.getNowEle(preEles.get(0), eleName).get(0);
        }
        String[] ss = new String[1];
        ss[0] = ele.getFirstChild().getNodeValue();
        return ss;
    }
}
