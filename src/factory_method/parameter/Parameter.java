package factory_method.parameter;

public class Parameter {
    private String name;
    private Product product;

    public Parameter(String name, Product product) {
        this.name = name;
        this.product = product;

    }
    public void test(){
        System.out.println(name+"通过传参执行的哦");
    }
}
