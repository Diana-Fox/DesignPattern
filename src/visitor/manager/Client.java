package visitor.manager;

public class Client {
    public static void main(String[] args) {
        //创建ObjectStructure
        ObjectStructure os = new ObjectStructure();

        Customer cm1 = new EnterpriseCustomer();
        cm1.setName("ABC集团");
        os.addElement(cm1);

        Customer cm2 = new EnterpriseCustomer();
        cm2.setName("DEF公司");
        os.addElement(cm2);

        Customer cm3 = new PersonalCustomer();
        cm3.setName("小宝");
        os.addElement(cm3);

        ServiceRequestVisitor srVisitor = new ServiceRequestVisitor();
        os.handleRequest(srVisitor);

        PredilectionVisitor paVisitor = new PredilectionVisitor();
        os.handleRequest(paVisitor);

        WorthAnalyzeVisitor waVisitor = new WorthAnalyzeVisitor();
        os.handleRequest(waVisitor);
    }
}
