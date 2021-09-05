package strategy.quotation;

public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    double quote(double goodsPrice) {
        return strategy.calcPrice(goodsPrice);
    }
}
