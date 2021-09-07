package state;

/**
 * 封装与Context的一个特定状态相关的行为
 */
public interface State {
    /**
     * 状态对应处理
     *
     * @param sampleParameter
     */
    void handle(String sampleParameter);
}
