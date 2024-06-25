package com.qa;

import com.qa.child.Circle;
import com.qa.child.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        circle.areaOfShape();
        square.areaOfShape();

    }
}
