package Q1;
import java.util.Scanner;

public class LP4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter package weight: ");
        int weight = input.nextInt();
        System.out.print("Enter package length: ");
        int length = input.nextInt();
        System.out.print("Enter package width: ");
        int width = input.nextInt();
        System.out.print("Enter package height: ");
        int height = input.nextInt();
        int size = height * width * length;
        if (weight > 27 && size > 100000) {
            System.out.println("Too Heavy and Too Large");
        }
        else if (weight < 28 && size > 100000) {
            System.out.println("Too Large");
        }
        else if (weight > 27 && size < 100001) {
            System.out.println("Too Heavy");
        } else System.out.println("All Good!");
    }
}
