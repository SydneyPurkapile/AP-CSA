package Q3.Prog702p;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog702p {
    public static void main(String[] args) {
        try {
           Scanner file = new Scanner(new File("Langdat/prog701g.dat"));

            while (file.hasNext()) {
                if (file.nextInt() == 1)
                    Hiccas bob = new Hiccas(file.next(), file.next(), file.next(), file.nextDouble());
                    double ah = bob.getAverage();
                else if (file.nextInt() == 2)
                    Wallies jeff = new Wallies(file.next(), file.next(), file.next(), file.nextInt());
                    int aw = jeff.getAverage();
                else if (file.nextInt() == 3)
                    Beepers jerry = new Beepers(file.next(), file.next(), file.next(), file.next());
                    String ab = jerry.getAverage();
                else
                    return;
            }

            System.out.println("Average value of Hicca fur: " + ah);
            System.out.println("Average number of steps taken by the Wallies: " + aw);
            System.out.println("Average size of the Beepers' words: " + ab);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
