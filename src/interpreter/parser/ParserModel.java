package interpreter.parser;

/**
 * 用来封装每一个解析出来的元素对应的属性
 */
public class ParserModel {
    //是否单个值
    private boolean singleValue;
    //是否属性，不是属性就是元素
    private boolean propertyValue;
    //是否终结符
    private boolean end;

    public boolean isSingleValue() {
        return singleValue;
    }

    public void setSingleValue(boolean singleValue) {
        this.singleValue = singleValue;
    }

    public boolean isPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(boolean propertyValue) {
        this.propertyValue = propertyValue;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
