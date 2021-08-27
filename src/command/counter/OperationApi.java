package command.counter;

public interface OperationApi {
    int getResult();

    void setResult(int result);

    void add(int opeNum);

    void substract(int opeNum);
}
