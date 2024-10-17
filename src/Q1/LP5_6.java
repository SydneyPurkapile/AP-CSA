package Q1;
import java.util.Scanner;

public class LP5_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int total = n1 + n2 + n3;
        System.out.println("The sum of the digits is: " + total);
    }
}
