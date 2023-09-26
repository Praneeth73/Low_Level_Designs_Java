package DesignPatterns.Strategy;

import java.util.HashMap;
import java.util.Map;

public class StrategyContext {


    // price of the ticket
    Integer price;
    Map<String, OfferStrategy> strategyMap = new HashMap<>();

    StrategyContext(Integer price){
        this.price = price;
        strategyMap.put(NoDiscounted.class.getName(),new NoDiscounted());
        strategyMap.put(Discounted.class.getName(), new Discounted());
    }

    public OfferStrategy getStrategy(int month){
        if(month > 6){
            return strategyMap.get(NoDiscounted.class.getName());
        }else{
            return strategyMap.get(Discounted.class.getName());
        }
    }

    public void applyStrategy(OfferStrategy strategy){
        System.out.println("Before Applying discount : " + price);
        price = price * strategy.getDiscountPercentage();
        System.out.println("After Applying discount " + price);
    }

}
