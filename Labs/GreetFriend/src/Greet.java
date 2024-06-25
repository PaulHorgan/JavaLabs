

public class Greet {
    public static void  main (String[] args) {
        String fName = "Paul";
        String sName = "Horgan";

        String fullName = fName+" "+sName;
        System.out.println(fullName);

        int num1 = 3, num2 = 0;
        int age = 39;
        num2 = ++num1;
        System.out.println(num1);
        System.out.println(num2);

        num2 = num1++;
        System.out.println(num1);
        System.out.println(num2);

        String me = "I am " + age + " years old";
        boolean messageCheck = me.equals("I am 40 years old");
        System.out.println(me);
        System.out.println(messageCheck);
    }
}

