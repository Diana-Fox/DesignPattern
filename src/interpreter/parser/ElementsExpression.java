package interpreter.parser;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 元素作为非终结符对应的解释器，解释并执行中间元素
 */
public class ElementsExpression extends ReadXmlExpression {
    //用来记录组合的ReadXmlExpression元素
    private Collection<ReadXmlExpression> eles = new ArrayList<>();
    //元素名称
    private String eleName = "";

    public ElementsExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }

    @Override
    public String[] interpret(Context cxt) {
        //先取出上下文里的当前元素作为父级元素
        List<Element> preEles = cxt.getPreEles();

        //把当前获取的元素放到上下文里面，这次是获取多个元素
        List<Element> nowEles = new ArrayList<>();
        if (preEles.size() == 0) {
            //说明现在获取的是根元素
            Element ele = cxt.getDocument().getDocumentElement();
            nowEles.add(ele);
        } else {
            //循环父元素
            for (Element ele : preEles) {
                nowEles.addAll(cxt.getNowEle(ele, eleName));
            }
        }
        cxt.setPreEles(nowEles);
        String[] ss = null;
        for (ReadXmlExpression ele :
                eles) {
            ss = ele.interpret(cxt);
        }
        return ss;
    }
}
