package interpreter.read_config_pro;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 元素作为终结符对应的解释器
 */
public class ElementsTerminalExpression extends ReadXmlExpression {
    //元素名字
    private String eleName = "";

    public ElementsTerminalExpression(String eleName) {
        this.eleName = eleName;
    }

    @Override
    public String[] interpret(Context cxt) {
        //先取出上下文中的父级元素
        List<Element> preEles = cxt.getPreEles();
        //获取当前的多个元素
        List<Element> nowEles = new ArrayList<>();
        for (Element ele : preEles) {
            nowEles.addAll(cxt.getNowEle(ele, eleName));
        }
        String[] ss = new String[nowEles.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = nowEles.get(i).getFirstChild().getNodeValue();
        }
        return ss;
    }
}
