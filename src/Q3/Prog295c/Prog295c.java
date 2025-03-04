package Q3.Prog295c;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog295c {
    public static void main(String[] args) {
        try {
            Scanner file1 = new Scanner(new File("Langdat/merge1.dat"));

            while (file1.hasNext()) {

            }

            Scanner file2 = new Scanner(new File("Langdat/merge2.dat"));

            while (file2.hasNext()) {

            }

            Scanner file3 = new Scanner(new File("Langdat/merge3.dat"));

            while (file3.hasNext()) {

            }

            Scanner file4 = new Scanner(new File("Langdat/merge4.dat"));

            while (file4.hasNext()) {

            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
