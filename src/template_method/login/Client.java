package template_method.login;

public class Client {
    public static void main(String[] args) {
        LoginModel lm = new LoginModel();
        lm.setLoginId("admin");
        lm.setPwd("workerPwd");
        LoginTemplate lt = new WorkerLogin();
        LoginTemplate lt2 = new NormalLogin();
        boolean flag = lt.login(lm);
        System.out.println("可以登录工作平台=" + flag);
        boolean flag2 = lt2.login(lm);
        System.out.println("可以登录普通人平台=" + flag2);





    }
}
