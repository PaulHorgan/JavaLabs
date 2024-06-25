import java.rmi.AccessException;
import java.rmi.server.ExportException;

public class Main {
    public static void main(String[] args) {
        try { //the action to attempt!
            System.out.println(4/2);
            System.out.println(4/1);
            System.out.println(4/4);
            System.out.println(4/0);

        }catch(ArithmeticException e) { //specific "EXCEPTION" action - ArithmeticException!
            System.out.println("Maths is not your Forte! DO NOT DIVIDE BY ZERO");
        }catch(ArrayIndexOutOfBoundsException e) { //specific "EXCEPTION" action - ArithmeticException!
            System.out.println("choose a valid value");
        }catch(Exception e){ // if unspecified Exception
            System.out.println("UNKNOWN FAILURE");
        }finally{ //ALWAYS runs - "END" or "Finished" are likely
            System.out.println("Finished - NOT JUST GO AWAY");
        }
    }
}
