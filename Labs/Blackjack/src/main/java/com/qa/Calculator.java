
package com.qa;

public class Calculator {

    int sum;
    double sum2;
    public int addNumbers ( int a, int y){
        sum = a + y;
        return sum;
    }
    public int subNumbers ( int a, int y){
        sum = a - y;
        return sum;
    }
    public double divNumbers ( int a, int y){
        sum2 = a / y;
        return sum2;
    }
    public int multNumbers ( int a, int y){
        sum = a * y;
        return sum;

    }
}
