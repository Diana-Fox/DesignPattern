package responsibility.fee_plus;


public class Client {
    public static void main(String[] args) {
        Handler h1 = new ProjectManger2();
        Handler h2 = new DepManger2();
        Handler h3 = new GeneralManger2();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        FeeRequestModel frm = new FeeRequestModel();
        frm.setFee(300);
        frm.setUser("小宝");
        String r1 = (String) h1.handleRequest(frm);
        System.out.println("r1=" + r1);

        frm.setFee(800);
        String r2 = (String) h1.handleRequest(frm);
        System.out.println("r2=" + r2);

        frm.setFee(1800);
        String r3 = (String) h1.handleRequest(frm);
        System.out.println("r3=" + r3);

        PreFeeRequestModel pfrm = new PreFeeRequestModel();
        pfrm.setUser("小宝");
        pfrm.setFee(3000);
        h1.handleRequest(pfrm);
        pfrm.setFee(6000);
        h1.handleRequest(pfrm);
        pfrm.setFee(33000);
        h1.handleRequest(pfrm);
    }
}
