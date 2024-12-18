package Q2.Prog410t;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog410t {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/survey2.dat"));
            System.out.println("ID\t\tIncome\t\tMembers");
            int count = 0;

            while (file.hasNext()) {
                int id = file.nextInt();
                int income = file.nextInt();
                int members = file.nextInt();
                count++;
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
