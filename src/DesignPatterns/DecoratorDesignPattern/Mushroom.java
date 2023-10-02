package DesignPatterns.DecoratorDesignPattern;

public class Mushroom extends ToppingsDecoratorPattern{

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    int amount() {
        return this.basePizza.amount() +  20;
    }
}
