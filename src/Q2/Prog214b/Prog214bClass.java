package Q2.Prog214b;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214bClass {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214b.dat"));
            System.out.println("Employee #\tHours\tRate\tShift Factor\tGross Pay\tWithholding\tFICA\tNet Pay\tYear to Date");

            while (file.hasNext()) {
                int employee = file.nextInt();
                double ytd = file.nextDouble();
                double bpr = file.nextDouble();
                double sc = file.nextDouble();
                double hours = file.nextDouble();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
