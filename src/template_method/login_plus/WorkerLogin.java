package template_method.login_plus;

public class WorkerLogin extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String loginId) {
        LoginModel lm = new LoginModel();
        lm.setLoginId(loginId);
        lm.setPwd("workerPwd");
        return lm;
    }

    @Override
    public String encryptPws(String pwd) {
        System.out.println("使用md5加密");
        return super.encryptPws(pwd);
    }
}
