package responsibility.fee;

public class Client {
    public static void main(String[] args) {
        Handler h1 = new ProjectManger();
        Handler h2 = new DepManger();
        Handler h3 = new GeneralManger();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);

        String r1 = h1.handleFeeRequest("小宝", 300);
        System.out.println("the r1="+r1);
        String r2 = h1.handleFeeRequest("宝宝", 300);
        System.out.println("the r2="+r2);

        String r3 = h1.handleFeeRequest("小宝", 800);
        System.out.println("the r3="+r3);
        String r4 = h1.handleFeeRequest("宝宝", 800);
        System.out.println("the r4="+r4);

        String r5 = h1.handleFeeRequest("小宝", 1300);
        System.out.println("the r5="+r5);
        String r6 = h1.handleFeeRequest("宝宝", 1300);
        System.out.println("the r6="+r6);
    }
}
