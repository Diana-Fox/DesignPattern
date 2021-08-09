package factory.configure;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 工厂类
 */
public class Factory {
    /**
     * 根据不同的条件，生成不同的对象
     * 如果只有一个实现，则忽略条件
     *
     * @param type
     * @return
     */
    public static Api createApi() {
        //读取配置文件
        Properties properties = new Properties();
        InputStream in = null;
        try {
            in = Factory.class.getResourceAsStream("Factory.properties");
            properties.load(in);
        } catch (IOException e) {
            System.out.printf("配置文件异常，异常信息如下");
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        //通过反射创建类
        Api api = null;
        try {
            api = (Api) Class.forName(properties.getProperty("ImplClass")).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return api;
    }
}
