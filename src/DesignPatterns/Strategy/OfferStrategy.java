package DesignPatterns.Strategy;

// This is interface for offer strategy, has two method get class name and discount offer, based on the discounts other
// class need to implement this interface.
public interface OfferStrategy {

    String name();
    Integer getDiscountPercentage();

}
