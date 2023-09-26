package DesignPatterns.Strategy;

public class Discounted implements OfferStrategy{
    @Override
    public String name() {
        return  this.getClass().getName();
    }

    @Override
    public Integer getDiscountPercentage() {
        return 10;
    }
}
