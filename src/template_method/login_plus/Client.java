package template_method.login_plus;

public class Client {
    public static void main(String[] args) {
        NormalLoginModel nlm = new NormalLoginModel();
        nlm.setLoginId("testUser");
        nlm.setPwd("testPwd");
        nlm.setQuestion("testQuestion");
        nlm.setAnswer("testAnswer");
        LoginTemplate nlp = new NormalLoginPlus();
        boolean flag = nlp.login(nlm);
        System.out.println("普通人的加强版登录=" + flag);
    }
}
