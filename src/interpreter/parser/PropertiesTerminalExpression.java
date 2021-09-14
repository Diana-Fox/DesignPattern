package interpreter.parser;

import org.w3c.dom.Element;

import java.util.List;

/**
 * 属性作为终结符对应的解释器
 */
public class PropertiesTerminalExpression extends ReadXmlExpression {
    //属性的名字
    private String propName;

    public PropertiesTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context cxt) {
        List<Element> preEles = cxt.getPreEles();
        //直接获取最后的元素的属性的值
        String[] ss = new String[preEles.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = preEles.get(i).getAttribute(propName);
        }
        return ss;
    }
}
