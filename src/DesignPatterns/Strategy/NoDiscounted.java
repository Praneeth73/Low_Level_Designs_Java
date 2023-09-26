package DesignPatterns.Strategy;

public class NoDiscounted implements OfferStrategy{
    @Override
    public String name() {
        return this.getClass().getName();
    }

    @Override
    public Integer getDiscountPercentage() {
        return 0;
    }
}
