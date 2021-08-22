package proxy.data_access;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class UserManager {
    public Collection<UserModelApi> getUserByDepId(String depId) {
        Collection<UserModelApi> col = new ArrayList<>();
        Connection conn = null;

        try {
            conn = this.getConnection();
            String sql = "select * from TBL_USER u,TBL_DEP d " +
                    "where u.depId=d.depId and d.depId like ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, depId + "%");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                //创建一个代理对象
                Proxy proxy = new Proxy(new UserModel());
                proxy.setUserId(rs.getString("userId"));
                proxy.setName(rs.getString("name"));
                col.add(proxy);
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return col;
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection
                ("jdbc:mysql://192.168.1.32:3306/DEP_DATA?useUnicode=true&characterEncoding=utf-8",
                        "root", "Gaojingjian@123");
    }
}
