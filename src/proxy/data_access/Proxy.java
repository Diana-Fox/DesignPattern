package proxy.data_access;

import java.sql.*;

public class Proxy implements UserModelApi {
    //被代理对象
    private UserModel realSubject;
    //标识是否已经重新装载过数据
    private boolean loaded = false;

    public Proxy(UserModel realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public String getUserId() {
        return realSubject.getUserId();
    }

    @Override
    public void setUserId(String userId) {
        realSubject.setUserId(userId);
    }

    @Override
    public String getName() {
        return realSubject.getName();
    }

    @Override
    public void setName(String name) {
        realSubject.setName(name);
    }

    @Override
    public String getDepId() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getDepId();
    }


    @Override
    public void setDepId(String depId) {
        realSubject.setDepId(depId);
    }

    @Override
    public String getSex() {
        if (!this.loaded) {
            reload();
            this.loaded = true;
        }
        return realSubject.getSex();
    }

    @Override
    public void setSex(String sex) {
        realSubject.setSex(sex);
    }

    /**
     * 重新查询数据库以获取完整的用户数据
     */
    private void reload() {
        System.out.println("去数据库查询，" + realSubject.getUserId());
        Connection conn = null;

        try {
            conn = this.getConnection();
            String sql = "select * from TBL_USER where userId=? ";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, realSubject.getUserId());
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                realSubject.setDepId(rs.getString("depId"));
                realSubject.setSex(rs.getString("sex"));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection
                ("jdbc:mysql://192.168.1.32:3306/DEP_DATA?useUnicode=true&characterEncoding=utf-8",
                        "root", "Gaojingjian@123");
    }
}
