package DesignPatterns.FactoryDesignPattern;

public class ShapeFactory {


    Shape getShape(String value){

        switch(value){

            case "CIRCLE":
                return new Cicle();
            case "RECTANGLE":
                return new Rectangle();
            default :
                return null;

        }


    }

}
