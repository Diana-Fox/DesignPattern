package decorator.my_io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream2 extends FilterOutputStream {

    /**
     * 父类持有被装饰对象
     *
     * @param out
     */
    public EncryptOutputStream2(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        //每个值往后移动两位
        b += 2;
        if (b >= (97 + 26)) {
            //已经超过字母z了
            b -= 26;
        }
        super.write(b);
    }
}
