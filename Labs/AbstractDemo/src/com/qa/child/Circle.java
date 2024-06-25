package com.qa.child;

import com.qa.parent.Shape;

public class Circle extends Shape {

    @Override
    public void areaOfShape() {
        System.out.println("Pi r squared");
    }
}
