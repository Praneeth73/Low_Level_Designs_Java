package DesignPatterns.FactoryDesignPattern;

// Factory design pattern is a creational design pattern
public class MainClass {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("RECTANGLE");
        shape.draw();
    }
}
