package interpreter.parser;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * 元素作为非终结符对应的解释器，解释并执行中间元素
 */
public class ElementExpression extends ReadXmlExpression {
    //用来记录组合的ReadXmlExpression元素
    private Collection<ReadXmlExpression> eles = new ArrayList<>();
    //元素名称
    private String eleName = "";

    public ElementExpression(String eleName) {
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
        //查找到当前元素名称所对应的XML元素，并设置回到上下文中
        List<Element> preEles = cxt.getPreEles();
        Element ele = null;
        //把当前获取的元素放到上下文里面
        ArrayList<Element> nowEles = new ArrayList<>();
        if (preEles.size() == 0) {
            //说明现在获取的是根元素
            ele = cxt.getDocument().getDocumentElement();
            preEles.add(ele);
            cxt.setPreEles(preEles);
        } else {
            //根据父级元素和要找的元素的名称来获取当前的元素
            for (Element tempEle :
                    preEles) {
                nowEles.addAll(cxt.getNowEle(tempEle, eleName));
                if (nowEles.size() > 0) {
                    //找到一个就停止
                    break;
                }
            }
            List<Element> tempList = new ArrayList<>();
            tempList.add(nowEles.get(0));
            cxt.setPreEles(tempList);
        }
        String[] ss = null;
        //循环调用子元素的interpret方法
        for (ReadXmlExpression tempEle :
                eles) {
            ss = tempEle.interpret(cxt);
        }
        return ss;
    }
}
