package decorator.my_io;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Client {
    public static void main(String[] args) throws IOException {
        DataOutputStream dOut = new DataOutputStream(
                new BufferedOutputStream(new EncryptOutputStream(
                        new FileOutputStream("MyEncrypt.txt"))));
        dOut.write("abcdxyz".getBytes(StandardCharsets.UTF_8));
        //因为close会调用父类的实现，但是父类是个空方法，使用装饰有顺序
        dOut.close();

        DataOutputStream dOut2 = new DataOutputStream(
                new DataOutputStream(new EncryptOutputStream2(
                        new BufferedOutputStream(
                                new FileOutputStream("MyEncrypt2.txt")))));
        dOut2.write("abcdxyz".getBytes(StandardCharsets.UTF_8));
        //因为close会调用父类的实现，但是父类是个空方法，使用装饰有顺序
        dOut2.close();
    }
}
