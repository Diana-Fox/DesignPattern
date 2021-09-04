package template_method.login;

public class NormalLogin extends LoginTemplate {
    //写个假的示意
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("testPwd");
        return lm;
    }
}
