package interpreter.read_config_plus;

/**
 * 属性作为终结符对应的解释器
 */
public class PropertyTerminalExpression extends ReadXmlExpression {
    //属性的名字
    private String propName;

    public PropertyTerminalExpression(String propName) {
        this.propName = propName;
    }

    @Override
    public String[] interpret(Context cxt) {
        //直接获取最后的元素的属性的值
        String[] ss = new String[1];
        ss[0] = cxt.getPreEles().get(0).getAttribute(propName);
        return ss;
    }
}
