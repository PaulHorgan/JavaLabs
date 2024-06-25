import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            ageCheck(10);
        } catch (AgeCheckException e) {
            System.out.println(e);
        }
    }

    //method in main class! below initial public

    static void ageCheck(int age) throws AgeCheckException {
        if (age < 16) {
            throw new AgeCheckException("Sorry, you are required to be at least 16 for this basic account");
        } else {
            System.out.println("You are old enough for this account");
        }

    }


}
