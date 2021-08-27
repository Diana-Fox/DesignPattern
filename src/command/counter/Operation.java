package command.counter;

public class Operation implements OperationApi {
    private int result;

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public void add(int opeNum) {
        result = result + opeNum;
    }

    @Override
    public void substract(int opeNum) {
        result = result - opeNum;
    }
}
