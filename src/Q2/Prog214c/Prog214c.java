package Q2.Prog214c;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog214c.dat"));

            while (file.hasNext()) {
                String t = file.next();
                double g = file.nextDouble();
                String w = file.nextLine();
                Class214c wow = new Class214c(g, w, t);
                System.out.println(t + "\t" + g + "\t" + w);
                wow.calcGC();
                wow.calcWC();
                System.out.println(wow.getGC());
                System.out.println(wow.getWC());
                System.out.println(wow.getTGC());
                System.out.println(wow.getTotal());
            }


        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
P	15.0	 N
1.479
0.0
22.185000000000002
0.0
R	21.4	 Y
1.359
0.0
29.0826
0.0
H	7.5	 Y
1.429
0.0
10.717500000000001
0.0
R	17.9	 Y
1.359
0.0
24.326099999999997
0.0
 */