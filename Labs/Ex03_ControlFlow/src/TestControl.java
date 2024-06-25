public class TestControl {
    public static void main(String[] args) {
//Ex3-1 Task 2-1
        int x = 0;
        while (x < 10) {
            System.out.println("(" + x + "," + (x + 10) + ")");
            x++;
        }
        System.out.println("*******************");

//Ex3-1 Task 2-2

        int n = 1;
        int sum = 1;
        while (n < 10) {
            sum = 2 * sum;
            System.out.println("(" + n + "," + sum + ")");
            n++;
        }
        System.out.println("*******************");

        for (int i = 0; i < 10; i++) {
            System.out.println("(" + i + "," + (i + 10) + ")");
        }
        System.out.println("*******************");
        int sum2 = 1;
        for (int q = 1; q < 10; q++) {
            sum2 = 2 * sum2;
            System.out.println("(" + q + "," + sum2 + ")");

        }
        System.out.println("*******************");

        // EX 3-2 Task 1 - IF/Else
        int day = 2;
        if (day == 1) {
            System.out.println("it is Sunday");
        } else if (day == 2) {
            System.out.println("it is Monday");
        } else if (day == 3) {
            System.out.println("it is Tuesday");
        } else if (day == 4) {
            System.out.println("it is Wednesday");
        } else if (day == 5) {
            System.out.println("it is Thursday");
        } else if (day == 6) {
            System.out.println("it is Friday");
        } else {
            System.out.println("IT IS SATURDAY");
        }

        switch (day) {
            case 1:
                System.out.println("it is Sunday");
                break;
            case 2:
                System.out.println("it is Monday");
                break;
            case 3:
                System.out.println("it is Tuesday");
                break;
            case 4:
                System.out.println("it is Wednesday");
                break;
            case 5:
                System.out.println("it is Thursday");
                break;
            case 6:
                System.out.println("it is Friday");
                break;
            case 7:
                System.out.println("IT IS SATURDAY");
            default:
                System.out.println("It is not a day");
        }
        switch (day) {
            case 1, 7:
                System.out.println("IT IS THE WEEKEND");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Its a weekday - have alarm set");
        }
// EX 3-3 task 1
        for (int year= 1900; year < 2024; year++) {
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " was a leap year");
            }
        }


    }
}