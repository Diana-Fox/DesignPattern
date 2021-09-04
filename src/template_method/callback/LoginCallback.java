package template_method.callback;

/**
 * 回调接口，尽可能的把所有需要的接口方法都定义出来
 */
public interface LoginCallback {
    LoginModel findLoginUser(String loginId);

    String encryptPwd(String pwd, LoginTemplate template);

    boolean match(LoginModel lm, LoginModel dblm, LoginTemplate template);
}
