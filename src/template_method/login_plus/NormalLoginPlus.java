package template_method.login_plus;

public class NormalLoginPlus extends LoginTemplate {
    @Override
    public LoginModel findLoginUser(String loginId) {
        NormalLoginModel nlm = new NormalLoginModel();
        nlm.setLoginId(loginId);
        nlm.setPwd("testPwd");
        nlm.setQuestion("testQuestion");
        nlm.setAnswer("testAnswer");
        return nlm;
    }

    @Override
    public boolean match(LoginModel lm, LoginModel dbLm) {
        boolean f1 = super.match(lm, dbLm);
        if (f1) {
            //如果账号密码都正确，继续检查问题和答案
            NormalLoginModel nlm = (NormalLoginModel) lm;
            NormalLoginModel dbnlm = (NormalLoginModel) dbLm;
            if (dbnlm.getQuestion().equals(nlm.getQuestion())
                    && dbnlm.getAnswer().equals(nlm.getAnswer())) {
                return true;
            }
        }
        return false;
    }
}
