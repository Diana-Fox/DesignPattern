package visitor.combine;

public class ObjectStructure {
    /**
     * 表示结构对象
     */
    private Component root = null;

    /**
     * 提供给客户端操作的高层接口
     * @param visitor
     */
    public void handleRequest(Visitor visitor) {
        if (root != null) {
            root.accept(visitor);
        }
    }

    public void setRoot(Component root) {
        this.root = root;
    }
}
