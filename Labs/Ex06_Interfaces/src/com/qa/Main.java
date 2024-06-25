package com.qa;


public class Main {
    public static void main(String[] args) {
        //create rectangles
        Rectangle rectangle = new Rectangle("Box", "Green", 25, 20, 15, 20);
        Rectangle rect = new Rectangle("Box2", "White", 20, 21, 19, 21);
        Rectangle big = new Rectangle ("big box", "Gold", 25,12,19,15);
        //circles
        Circle circle = new Circle ("Sphere", "Green", 15,25,35);
        Circle circle2 = new Circle("The Sun", "yellow", 13, 12, 1357);

//print content.....
        System.out.println(rectangle);
        System.out.println(rect);
        System.out.println(big);
        System.out.println(circle);
        System.out.println(circle2);
        System.out.println("Circle Location before Move" + circle.getCurrentlocation());
        // using println("text" + circle.get**thing) gets just that one point from requested data

        circle.move(10.5, 4.3);
        System.out.println("Circle Location after Move" + circle.getCurrentlocation());
        circle.move(10.5, 4.3);
        System.out.println("Circle Location after Move 2" + circle.getCurrentlocation());




    }
}
