package template_method.crud;


import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public abstract class JDBCTemplate {
    protected final static int TYPE_CREATE = 1;
    protected final static int TYPE_UPDATE = 2;
    protected final static int TYPE_DELETE = 3;
    protected final static int TYPE_CONDITION = 4;

    public final void create(Object obj) {
        String sql = this.getMainSql(TYPE_CREATE);
        this.executeUpdate(sql, TYPE_CREATE, obj);
    }

    public final void update(Object obj) {
        String sql = this.getMainSql(TYPE_UPDATE);
        this.executeUpdate(sql, TYPE_UPDATE, obj);
    }

    public final void delete(Object obj) {
        String sql = this.getMainSql(TYPE_DELETE);
        this.executeUpdate(sql, TYPE_DELETE, obj);
    }

    public final Collection getByCondition(Object obj) {
        String sql = this.getMainSql(TYPE_CONDITION);
        return getByCondition(sql, obj);
    }


    public Collection getByCondition(String sql, Object obj) {
        Collection col = new ArrayList();
        Connection connection = null;
        try {
            //钩子方法
            connection = this.getConnection();
            //原语操作
            sql = this.prepareQuerySql(sql, obj);
            PreparedStatement pstmt = connection.prepareStatement(sql);
            //原语操作
            this.setQuerySqlValue(pstmt, obj);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                //原语操作
                col.add(this.rs2Object(rs));
            }
            rs.close();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return col;
    }

    //钩子方法
    protected Connection getConnection() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection
                ("jdbc:mysql://192.168.1.32:3306/DEP_DATA?useUnicode=true&characterEncoding=utf-8",
                        "root", "Gaojingjian@123");

    }

    /*~~~~~~~~~~~~~~~~~~原语操作~~~~~~~~~~~~~~~~~*/
    protected abstract String prepareQuerySql(String sql, Object obj);

    protected abstract Object rs2Object(ResultSet rs) throws SQLException;

    protected abstract void setQuerySqlValue(PreparedStatement pstmt, Object obj) throws SQLException;

    protected void executeUpdate(String sql, int type, Object obj) {
        Connection connection = null;
        try {
            //调用钩子方法
            connection = this.getConnection();
            PreparedStatement pstmt = connection.prepareStatement(sql);
            //原语操作
            this.setUpdateSqlValue(type, pstmt, obj);
            pstmt.executeUpdate();
            pstmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //不知道方法具体实现步骤
    protected abstract void setUpdateSqlValue(int type, PreparedStatement pstmt, Object obj) throws SQLException;


    //子类不同的操作,获取初始sql语句
    protected abstract String getMainSql(int type);
}
