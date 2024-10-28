package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog213e {
    public static void main(String[] args) {
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;
        int total = 0;
        try {
            Scanner file = new Scanner(new File("Langdat/prog213e.dat"));

            while (file.hasNext()) {
                int age = file.nextInt();
                total++;
                if (age < 20)
                    g1++;
                else if (age >= 20 && age < 40)
                    g2++;
                else if (age >= 40 && age < 60)
                    g3++;
                else if (age >= 60 && age < 80)
                    g4++;
                else
                    g5++;
            }

            System.out.println("<20: " + g1);
            System.out.println("20-39: " + g2);
            System.out.println("40-59: " + g3);
            System.out.println("60-79: " + g4);
            System.out.println(">79: " + g5);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
<20: 5
20-39: 5
40-59: 8
60-79: 3
>79: 2
 */