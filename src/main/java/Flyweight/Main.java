package Flyweight;

public class Main {

    public static void main(String[] args) {

        Circle s=(Circle)ShapeFactory.getShape("circle");
        s.setColor("green");
        s.draw();


        Circle s2=(Circle)ShapeFactory.getShape("circle");
        s.setColor("red");
        s.draw();


        Rectangle r=(Rectangle) ShapeFactory.getShape("rectangle");
        r.setColor("blue");
        r.draw();
    }
}
