package Q3.Prog703s;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.txt"));
            int AC = 0;
            int WV = 0;
            int LC = 0;

            while (file.hasNext()) {
                int type = file.nextInt();
                String n = file.next();
                int num = file.nextInt();
                double v = file.nextDouble();
                if (type == 1) {
                    String c = file.next();
                    Apple winter = new Apple(n, num, v, c);
                    if (c.equals("Green") || c.equals("Gold"))
                        AC++;
                } else if (type == 2) {
                    double ver = file.nextDouble();
                    Window maya = new Window(n, num, v, ver);
                    if (ver == 7.0)
                        WV++;
                } else if (type == 3) {
                    int c = file.nextInt();
                    Linux marlon = new Linux(n, num, v, c);
                    if (c % 5 == 0)
                        LC++;
                } else
                    return;
            }

            System.out.println("Apple computers that are green/gold: " + AC);
            System.out.println("Window computers that are version 7.0: " + WV);
            System.out.println("Linux computers that code ends in 5: " + LC);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Apple computers that are green/gold: 1
Window computers that are version 7.0: 2
Linux computers that code ends in 5: 4
 */