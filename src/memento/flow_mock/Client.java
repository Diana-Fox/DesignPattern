package memento.flow_mock;

public class Client {
    public static void main(String[] args) {
        //创建模拟运行流程的对象
        FlowMock mock = new FlowMock("TestFlowMock");
        //运行流程的第一阶段
        mock.runPhaseOne();

        //创建一个管理者对象
        FlowAMementoCareTaker careTaker = new FlowAMementoCareTaker();
        //创建第一阶段的备忘录对象
        FlowMockMemento memento = mock.createMemento();
        //备忘信息存入备忘录中
        careTaker.saveMemento(memento);

        //按照方案一来运行流程的后半段
        mock.schema1();

        //通过备忘录，将状态还原会未执行方案一时
        mock.setMemento(careTaker.retrieveMemento());

        //执行方案二
        mock.schema2();


    }
}
