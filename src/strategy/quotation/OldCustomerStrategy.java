package strategy.quotation;

public class OldCustomerStrategy implements Strategy {
    @Override
    public Double calcPrice(double goodsPrice) {
        System.out.println("老客户，统一九五折");
        return goodsPrice * 0.95;
    }
}
