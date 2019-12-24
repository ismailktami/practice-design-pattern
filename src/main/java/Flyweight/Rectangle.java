package Flyweight;

public class Rectangle extends Shape{

    private int x=4;
    private int y=6;
    private String color;

    public Rectangle(){}
    public Rectangle(String color){

        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println(this + "  color::"+color+"  x: " + x + "  y: " + y );

    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
