<<<<<<< HEAD
=======
package Q3.Prog703s;
>>>>>>> 6080bc01717a0571405af35a0d4f1482fa3c303c
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog703s {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog703s.dat"));

            while (file.hasNext()) {
<<<<<<< HEAD
                int type = file.nextInt();
                String name = file.next();
                int number = file.nextInt();
                double value = file.nextDouble();
                Student bob = new Student(name, number, value);
                if (type == 1) {
                    String color = file.next();
                    Apple jeff = new Apple(name, number, value, color);
                } else if (type == 2) {
                    double version = filoe.nextDouble();
                    Windows jeff = new Windows(name, number, value, version);
                } else if (type == 3) {
                    int code = file.nextInt();
                    Linux jeff = new Linux(name, number, value, code);
                } else
                    return;
                System.out.println(name + type);
=======

>>>>>>> 6080bc01717a0571405af35a0d4f1482fa3c303c
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 6080bc01717a0571405af35a0d4f1482fa3c303c
