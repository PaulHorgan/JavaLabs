import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MyConsoleReader {
    public void readAndPrint() {
        StringBuffer buffer = new StringBuffer();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
            System.out.println("Please enter some new text, or Stop to STOP");
            String line = br.readLine();
            while (!line.equals("Stop")) {
                buffer.append(line + "\n");
                System.out.println("Enter more text, or Stop to STOP");
                line = br.readLine();
            }
            System.out.println(buffer);

        } catch (IOException io){
            System.out.println("Error on input : " + io);
            io.printStackTrace();
        }
    }
}