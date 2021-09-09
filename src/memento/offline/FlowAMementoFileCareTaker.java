package memento.offline;


import java.io.*;

public class FlowAMementoFileCareTaker {
    //写到文件中
    public void saveMemento(FlowAMockMemento memento) {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream("FlowAMemento")));
            out.writeObject(memento);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null)
                    out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //从文件读出来
    public FlowAMockMemento retrieveMemento() {
        FlowAMockMemento memento = null;
        ObjectInputStream in = null;
        try {
            in = new ObjectInputStream(
                    new BufferedInputStream(
                            new FileInputStream("FlowAMemento")));
            memento = (FlowAMockMemento) in.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return memento;
    }
}
