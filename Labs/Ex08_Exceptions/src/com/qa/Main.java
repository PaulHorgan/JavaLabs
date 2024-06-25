package com.qa;

public class Main {
    public static void main(String[] args) {
        BadCalc b = new BadCalc();
        System.out.println("Mult = " + b.mult(4, 8));
        System.out.println("sqr1 = " + b.sqr1(4));
        System.out.println("sqr2 = " + b.sqr2(8));
        try {
            System.out.println("Div = " + b.div(4, 0));
        } catch (ArithmeticException e) {
            System.out.println("DO BETTER MATHS");
            System.out.println(e);
        } finally {
            System.out.println("DONE");
        }
    }
}