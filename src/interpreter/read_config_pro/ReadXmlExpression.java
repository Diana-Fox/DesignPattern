package interpreter.read_config_pro;

public abstract class ReadXmlExpression {
    /**
     * 解释表达式
     * @param cxt 上下文对象
     * @return 解析过后的值，为了通用，可能是单个值，也可能是多个值，因此返回一个数组对象
     */
    public abstract String[] interpret(Context cxt);
}
