package strategy.quotation;

public class NormalCustomerStrategy implements Strategy{
    @Override
    public Double calcPrice(double goodsPrice) {
        System.out.println("新客户和普通客户，没有折扣");
        return goodsPrice;
    }
}
