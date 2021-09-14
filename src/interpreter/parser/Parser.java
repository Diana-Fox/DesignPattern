package interpreter.parser;

import java.util.*;

/**
 * 根据语法来解析表达式，转换成为相应的抽象语法树
 */
public class Parser {
    private Parser() {
    }

    private final static String BACKLASH = "/";
    private final static String DOT = ".";
    private final static String DOLLAR = "$";

    private static List<String> listEle;

    public static ReadXmlExpression parse(String expr) {
        //初始化记录需解析的元素的名称的集合
        listEle = new ArrayList<>();

        //第一步，分解表达式，得到需要解析的元素名称和该元素对应的解析模型
        Map<String, ParserModel> mapPath = parseMapPath(expr);

        //第二步，根据节点的属性转换成相应的解释器对象
        List<ReadXmlExpression> list = mapPath2Interpreter(mapPath);

        //第三步，按照先后顺序，组合抽象语法树
        ReadXmlExpression returnRe = buildTree(list);

        //返回构建后的抽象语法树
        return returnRe;
    }

    /**
     * 第三步，构建抽象语法树
     *
     * @param list
     * @return
     */
    private static ReadXmlExpression buildTree(List<ReadXmlExpression> list) {
        ReadXmlExpression tree = null;
        ReadXmlExpression preNode = null;
        for (ReadXmlExpression re : list) {
            //第一个元素
            if (preNode == null) {
                preNode = re;
                tree = re;
            } else {
                //单元素值
                if (preNode instanceof ElementExpression) {
                    ElementExpression ele = (ElementExpression) preNode;
                    ele.addEle(re);
                    preNode = re;
                } else if (preNode instanceof ElementsExpression) {
                    //多元素值
                    ElementsExpression eles = (ElementsExpression) preNode;
                    eles.addEle(re);
                    preNode = re;
                }
            }
        }
        return tree;
    }

    /**
     * 第二步
     * 把分解出来的元素名称，根据对应的解析模型转换成为相应的解释器对象
     *
     * @param mapPath 分解出来的需要解析的元素名称和对应的解析模型
     * @return 元素按照分解顺序转换成解释器对象
     */
    private static List<ReadXmlExpression> mapPath2Interpreter(Map<String, ParserModel> mapPath) {
        List<ReadXmlExpression> list = new ArrayList<>();
        for (String key : listEle) {
            ParserModel pm = mapPath.get(key);
            ReadXmlExpression rxe = null;
            //不是最后一个元素
            if (!pm.isEnd()) {
                if (pm.isSingleValue()) {
                    //是单个元素
                    rxe = new ElementExpression(key);
                } else {
                    //是多个元素
                    rxe = new ElementsExpression(key);
                }
            } else {
                //是属性元素
                if (pm.isPropertyValue()) {
                    if (pm.isSingleValue()) {
                        //父元素单个值
                        rxe = new PropertyTerminalExpression(key);
                    } else {
                        //父元素多个值
                        rxe = new PropertiesTerminalExpression(key);
                    }
                } else {
                    if (pm.isSingleValue()) {
                        //单个终端字符
                        rxe = new ElementTerminalExpression(key);
                    } else {
                        //多个终端字符
                        rxe = new ElementsTerminalExpression(key);
                    }
                }
            }
            list.add(rxe);
        }
        return list;
    }

    /**
     * 按照从左到右顺序来分解表达式，得到需要解析的元素名称和该元素对应的解析模型
     *
     * @param expr
     * @return
     */
    private static Map<String, ParserModel> parseMapPath(String expr) {
        //先按照/分割字符串
        StringTokenizer tokenizer = new StringTokenizer(expr, BACKLASH);
        Map<String, ParserModel> mapPath = new HashMap<>();
        while (tokenizer.hasMoreTokens()) {
            String onePath = tokenizer.nextToken();
            if (tokenizer.hasMoreTokens()) {
                //还有下一个值，不是最后一个元素
                setParsePath(false, onePath, false, mapPath);
            } else {
                int dotIndex = onePath.indexOf(DOT);
                if (dotIndex > 0) {
                    String eleName = onePath.substring(0, dotIndex);
                    String propName = onePath.substring(dotIndex + 1);
                    //生成属性的父元素
                    setParsePath(false, eleName, false, mapPath);
                    //生成属性元素
                    setParsePath(true, propName, true, mapPath);

                } else {
                    //最后一个元素
                    setParsePath(true, onePath, false, mapPath);
                }
            }
        }
        return mapPath;
    }

    /**
     * 按照分解出来的位置和名称，生成解析元素模型
     *
     * @param end           是否是最后一个
     * @param eleName       元素名称
     * @param propertyValue 是否是属性
     * @param mapPath       解析模型的集合
     */
    private static void setParsePath(boolean end, String eleName, boolean propertyValue, Map<String, ParserModel> mapPath) {
        ParserModel pm = new ParserModel();
        pm.setEnd(end);
        //如果包含$符，就说明不是一个值
        pm.setSingleValue(!(eleName.indexOf(DOLLAR) > 0));
        pm.setPropertyValue(propertyValue);
        //把$去掉
        eleName = eleName.replace(DOLLAR, "");
        mapPath.put(eleName, pm);
        listEle.add(eleName);
    }
}
