package DesignPatterns.DecoratorDesignPattern;


// Decorator is a structural design pattern that lets you attach new behaviors to objects by placing
// these objects inside special wrapper objects that contain the behaviors.
public class Pizza {

    public static void main(String[] args) {
        BasePizza basePizza = new Margherita();

        ToppingsDecoratorPattern toppingsDecoratorPatten = new ExtraCheese(basePizza);
        ToppingsDecoratorPattern toppingsDecoratorPattern = new Mushroom(toppingsDecoratorPatten);

        System.out.println(toppingsDecoratorPattern.amount());
    }

}
