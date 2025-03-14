package Q3.Prog702q;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702q {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog702q.txt"));

            while (file.hasNext()) {
                int type = file.nextInt();
                String n = file.next();
                int t = file.nextInt();
                double v = file.nextDouble();
                if (type == 1) {
                    double w = file.nextDouble();
                    Cars honda = new Cars(n, t, v, w);
                } else if (type == 2) {
                    int m = file.nextInt();
                    Trucks ford = new Trucks(n, t, v, m);
                } else if (type == 3) {

                } else
                    return;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
