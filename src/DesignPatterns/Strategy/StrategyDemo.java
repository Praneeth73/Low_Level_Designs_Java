package DesignPatterns.Strategy;


//Strategy is behavioral design pattern. It is used to switch between family of algorithms
//This pattern enables an object to choose from multiple algorithms and behaviors at runtime,
//rather than statically choosing a single one

public class StrategyDemo {
    public static void main(String args[]) {
        StrategyContext context = new StrategyContext(100);
        System.out.println("Enter month number between 1 and 12");
        int month = Integer.parseInt(args[0]);
        System.out.println("Month =" + month);
        OfferStrategy strategy = context.getStrategy(month);
        context.applyStrategy(strategy);
    }
}
