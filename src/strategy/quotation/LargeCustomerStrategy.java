package strategy.quotation;

public class LargeCustomerStrategy implements Strategy {
    @Override
    public Double calcPrice(double goodsPrice) {
        System.out.println("大客户，统一九折");
        return goodsPrice * 0.9;
    }
}
