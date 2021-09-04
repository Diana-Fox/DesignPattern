package template_method.login_plus;

public abstract class LoginTemplate {
    public final boolean login(LoginModel lm) {
        LoginModel dbLm = this.findLoginUser(lm.getLoginId());
        if (dbLm != null) {
            //对密码进行加密
            String encryptPwd = encryptPws(lm.getPwd());
            //加密后的密码设置回去
            lm.setPwd(encryptPwd);
            //判断是否匹配
            return match(lm, dbLm);
        }
        return false;
    }

    public abstract LoginModel findLoginUser(String loginId);

    public boolean match(LoginModel lm, LoginModel dbLm) {
        if (lm.getLoginId().equals(dbLm.getLoginId())
                && lm.getPwd().equals(dbLm.getPwd())) {
            return true;
        }
        return false;
    }

    //默认不加密
    public String  encryptPws(String pwd) {
        return pwd;
    }

}
