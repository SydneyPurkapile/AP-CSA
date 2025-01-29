package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] mat = new int[4][5];
            System.out.println("Grade\tMale\tFemale\tTotal");
            int mc = 0;
            int fc = 0;
            int am = 0;
            int bm = 0;
            int cm = 0;
            int dm = 0;
            int fm = 0;
            int af = 0;
            int bf = 0;
            int cf = 0;
            int df = 0;
            int ff = 0;

            while (file.hasNext()) {
                if (file.nextInt() == 1) {
                    mc++;
                    if (file.nextInt() == 1)
                        am++;
                    else if (file.nextInt() == 2)
                        bm++;
                    else if (file.nextInt() == 3)
                        cm++;
                    else if (file.nextInt() == 4)
                        dm++;
                    else if (file.nextInt() == 5)
                        fm++;
                }
                else if (file.nextInt() == 2) {
                    fc++;
                    if (file.nextInt() == 1)
                        af++;
                    else if (file.nextInt() == 2)
                        bf++;
                    else if (file.nextInt() == 3)
                        cf++;
                    else if (file.nextInt() == 4)
                        df++;
                    else if (file.nextInt() == 5)
                        ff++;
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
