package generator.insurance;

/**
 * 保险合同对象
 */
public class InsuranceContract {
    //合同编号
    private String contractId;
    //保险公司和保险人只有一个
    //被保险人的名称
    private String personName;
    //被保险公司的名称
    private String companyName;
    //开始生效时间
    private long beginDate;
    //失效日期
    private long endDate;
    //其他数据
    private String otherDate;

    /**
     * 构造方法,只能同包访问
     */
    InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.getContractId();
        this.personName = builder.getPersonName();
        this.companyName = builder.getCompanyName();
        this.beginDate = builder.getBeginDate();
        this.endDate = builder.getEndDate();
        this.otherDate = builder.getOtherDate();

    }

    /**
     * 模拟业务方法
     */
    public void someOperation() {
        System.out.println("保险合同的一些操作" + this.contractId+"~"+
                this.personName);
    }
}
