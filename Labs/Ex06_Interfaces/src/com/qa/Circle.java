package com.qa;

public class Circle extends Shape implements Moveable {

    private double radius;

    public Circle(String name, String colour, double x, double y, double radius) {
        super(name, colour, x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle : Radius ="+radius + ": getArea() = " + getArea() + ": getCenterPoint = " + getCenterPoint() + ": getX = " + getX() + ":getY = " + getY() + ": Name = " + getName() + ": Colour = " + getColour() + "]";
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public Point getCenterPoint() {
        return new Point(getX(), getY());
    }

    @Override
    public void move(double x, double y) {
        setX(getX()+x);
        setY(getY()+y);

    }

    @Override
    public Point getCurrentlocation(){
        return getCenterPoint();
    }
}
