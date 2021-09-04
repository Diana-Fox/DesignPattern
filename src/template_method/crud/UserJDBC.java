package template_method.crud;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserJDBC extends JDBCTemplate {
    @Override
    protected String prepareQuerySql(String sql, Object obj) {
        UserQueryModel uqm = (UserQueryModel) obj;
        StringBuffer sb = new StringBuffer();
        sb.append(sql);
        if (uqm.getName() != null && uqm.getName().trim().length() > 0) {
            sb.append(" and name like ?");
        }
        if (uqm.getUuid() != null && uqm.getUuid().trim().length() > 0) {
            sb.append(" and uuid=?");
        }
        if (uqm.getAge() > 0) {
            sb.append(" and age >=?");
        }
        if (uqm.getAge2() > 0) {
            sb.append(" and age <=?");
        }
        return sb.toString();
    }

    @Override
    protected Object rs2Object(ResultSet rs) throws SQLException {
        UserModel um = new UserModel();
        String uuid = rs.getString("uuid");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        um.setName(name);
        um.setAge(age);
        um.setUuid(uuid);
        return um;
    }

    @Override
    protected void setQuerySqlValue(PreparedStatement pstmt, Object obj) throws SQLException {
        UserQueryModel uqm = (UserQueryModel) obj;
        int count = 1;
        if (uqm.getUuid() != null && uqm.getUuid().trim().length() > 0) {
            pstmt.setString(count++, uqm.getUuid());
        }
        if (uqm.getName() != null && uqm.getName().trim().length() > 0) {
            pstmt.setString(count++, uqm.getName());
        }
        if (uqm.getAge() > 0) {
            pstmt.setInt(count++, uqm.getAge());
        }
        if (uqm.getAge2() > 0) {
            pstmt.setInt(count++, uqm.getAge2());
        }
    }


    @Override
    protected void setUpdateSqlValue(int type, PreparedStatement pstmt, Object obj) throws SQLException {
        if (type == TYPE_CREATE) {
            this.setCreateValue(pstmt, (UserModel) obj);
        } else if (type == TYPE_DELETE) {
            this.setDeleteValue(pstmt, (UserModel) obj);
        } else if (type == TYPE_UPDATE) {
            this.setUpdateValue(pstmt, (UserModel) obj);
        }
    }

    private void setUpdateValue(PreparedStatement pstmt, UserModel obj) throws SQLException {
        pstmt.setString(1, obj.getName());
        pstmt.setInt(2, obj.getAge());
        pstmt.setString(3, obj.getUuid());
    }

    private void setDeleteValue(PreparedStatement pstmt, UserModel obj) throws SQLException {
        pstmt.setString(1, obj.getUuid());
    }

    private void setCreateValue(PreparedStatement pstmt, UserModel obj) throws SQLException {
        pstmt.setString(1, obj.getUuid());
        pstmt.setString(2, obj.getName());
        pstmt.setInt(3, obj.getAge());
    }

    @Override
    protected String getMainSql(int type) {
        String sql = "";
        if (type == TYPE_CREATE) {
            sql = "insert into tbl_TestUser value(?,?,?)";
        } else if (type == TYPE_DELETE) {
            sql = "delete from tbl_TestUser where uuid=?";
        } else if (type == TYPE_UPDATE) {
            sql = "update tbl_TestUser set name=?,age=? where uuid=?";
        } else {
            sql = "select * from tbl_TestUser where 1=1";
        }
        return sql;
    }
}
