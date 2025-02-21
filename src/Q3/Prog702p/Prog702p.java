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
                    AHHHHHHHHH;
                else if (file.nextInt() == 2)
                    AJJJJJJJJJJJJJ;
                else if (file.nextInt() == 3)
                    AJJJJJJJJJkKK;
                else
                    return;
            }

            System.out.println("Average value of Hicca fur: ");
            System.out.println("Average number of steps taken by the Wallies: ");
            System.out.println("Average size of the Beepers' words: ");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
