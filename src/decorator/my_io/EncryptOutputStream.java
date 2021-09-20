package decorator.my_io;

import java.io.IOException;
import java.io.OutputStream;

public class EncryptOutputStream extends OutputStream {
    private OutputStream os = null;

    public EncryptOutputStream(OutputStream os) {
        this.os = os;
    }

    @Override
    public void write(int b) throws IOException {
        //每个值往后移动两位
        b += 2;
        if (b >= (97 + 26)) {
            //已经超过字母z了
            b -= 26;
        }
        this.os.write(b);
    }
}
