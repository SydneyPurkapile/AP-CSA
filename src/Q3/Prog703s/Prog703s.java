package Q3.Prog703s;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.dat"));

            while (file.hasNext()) {
                int type = file.nextInt();
                String n = file.next();
                int num = file.nextInt();
                double v = file.nextDouble();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
