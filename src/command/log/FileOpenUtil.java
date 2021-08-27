package command.log;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOpenUtil {
    private FileOpenUtil() {
    }

    public static List readFile(String pathName) throws IOException {
        List list = new ArrayList<>();
        ObjectInputStream oin = null;
        try {
            File f = new File(pathName);
            if (f.exists()) {
                oin = new ObjectInputStream(
                        new BufferedInputStream(
                                new FileInputStream(f)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void writeFile(String pathName, List list) {
        File f = new File(pathName);
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new BufferedOutputStream(
                    new FileOutputStream(f)));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
