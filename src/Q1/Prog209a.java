package Q1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog209a {
    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int total = 0;
        try {
            Scanner file = new Scanner(new File("Langdat/prog215a.dat"));

            while (file.hasNext()) {
                total++;
                int num = file.nextInt();
                if (num < 500) {
                    count1++;
                }
                else
                    count2++;
            }
            System.out.println("Total amount of numbers less than 500: " + count1);
            System.out.println("Total amount of numbers greater than or equal to 500: " + count2);
            System.out.println("Total amount of numbers: " + total);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
Total amount of numbers less than 500: 192
Total amount of numbers greater than or equal to 500: 208
Total amount of numbers: 400
 */