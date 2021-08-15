package generator.insurance;

public class ConcreteBuilder {
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

    //通过构造方法，把必填的填上
    public ConcreteBuilder(String contractId, long beginDate, long endDate) {
        this.contractId = contractId;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }

    /**
     * 真正的构造InsuranceContract对戏
     *
     * @return
     */
    public InsuranceContract build() {
        //也可以在本方法校验数据，通常涉及多个属性的校验会在此处
        //参考前端页面提交的校验原则，此处偷懒，不写校验逻辑了
        return new InsuranceContract(this);
    }

    //其余字段选填
    public String getContractId() {
        return contractId;
    }


    public String getPersonName() {
        return personName;
    }

    public ConcreteBuilder setPersonName(String personName) {
        //可以在这里加约束，判断是否有公司名称的存在
        this.personName = personName;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public ConcreteBuilder setCompanyName(String companyName) {
        //可以在这里加约束，判断是否有人员名称的存在
        this.companyName = companyName;
        return this;
    }

    public long getBeginDate() {
        return beginDate;
    }


    public long getEndDate() {
        return endDate;
    }


    public String getOtherDate() {
        return otherDate;
    }

    public ConcreteBuilder setOtherDate(String otherDate) {
        this.otherDate = otherDate;
        return this;
    }
}
