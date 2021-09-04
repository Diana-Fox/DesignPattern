package template_method.callback;

public class Client {
    public static void main(String[] args) {
        LoginModel loginModel = new LoginModel();
        loginModel.setLoginId("admin");
        loginModel.setPwd("workerPwd");
        LoginTemplate lt = new LoginTemplate();
        //用匿名内部类实现回调
        boolean flag = lt.Login(loginModel, new LoginCallback()  {
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel lm = new LoginModel();
                lm.setLoginId(loginId);
                lm.setPwd("testPwd");
                return lm;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dblm, LoginTemplate template) {

                return template.match(lm, dblm);
            }
        });
        System.out.println("可以进行普通人员登录=" + flag);

        boolean flag2 = lt.Login(loginModel, new LoginCallback() {
            @Override
            public LoginModel findLoginUser(String loginId) {
                LoginModel lm = new LoginModel();
                lm.setLoginId(loginId);
                lm.setPwd("workerPwd");
                return lm;
            }

            @Override
            public String encryptPwd(String pwd, LoginTemplate template) {
                System.out.println("使用MD5进行加密");
                return template.encryptPwd(pwd);
            }

            @Override
            public boolean match(LoginModel lm, LoginModel dblm, LoginTemplate template) {
                return template.match(lm, dblm);
            }
        });
        System.out.println("工作人员登录="+flag2);

    }
}
