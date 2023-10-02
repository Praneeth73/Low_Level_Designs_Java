package DesignPatterns.DecoratorDesignPattern;

public class ExtraCheese extends ToppingsDecoratorPattern{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int amount() {
        return this.basePizza.amount() + 10;
    }
}
