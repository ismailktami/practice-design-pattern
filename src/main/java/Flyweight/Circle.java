package Flyweight;

public class Circle extends Shape {
    private String color;
    private int x = 12;
    private int y = 24;
    private int raidus = 45;

    @Override
    public void draw() {
        System.out.println(this + "  color::"+color+"  x: " + x + "  y: " + y + "  radius: " + raidus);
    }

    public Circle() {
    }

    public Circle(String c) {
        this.color = c;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getRaidus() {
        return raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
