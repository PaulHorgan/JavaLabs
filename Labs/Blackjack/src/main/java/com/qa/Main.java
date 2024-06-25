package com.qa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first player's hand value:");
        int handOne = scanner.nextInt();

        System.out.println("Enter second player's hand value:");
        int handTwo = scanner.nextInt();

        int result = blackjack.play(handOne, handTwo);

        if (result == 0) {
            System.out.println("It's a tie");
        } else if (result == 1) {
            System.out.println("Total cannot be less than 2");
        }else if (result == 2) {
            System.out.println("Both hands are over 21");
        } else {
            System.out.println("The winning hand is: " + result);
        }

        scanner.close();
    }
}