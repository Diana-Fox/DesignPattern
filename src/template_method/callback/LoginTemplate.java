package template_method.callback;

public class LoginTemplate {
    public final boolean Login(LoginModel lm, LoginCallback callback) {
        LoginModel dbLm = callback.findLoginUser(lm.getLoginId());
        if (dbLm != null) {
            String encryptPwd = callback.encryptPwd(lm.getPwd(), this);
            lm.setPwd(encryptPwd);
            return callback.match(lm, dbLm, this);
        }
        return false;
    }

    public String encryptPwd(String pwd) {
        return pwd;
    }

    public boolean match(LoginModel lm, LoginModel dbLm) {
        if (lm.getLoginId().equals(dbLm.getLoginId())
                && lm.getPwd().equals(dbLm.getPwd())) {
            return true;
        }
        return false;
    }
}
