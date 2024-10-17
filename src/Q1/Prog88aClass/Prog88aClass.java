package Q1.Prog88aClass;
import java.util.Scanner;

public class Prog88aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 13: " );
        int num1 = input.nextInt();
        System.out.print("Enter a number between 2 and 20: ");
        int num2 = input.nextInt();

        Class88a wow = new Class88a(num1, num2);
        wow.calc();
        int sum = wow.sum();
        int dif = wow.dif();
        int pro = wow.pro();
        double avg = wow.avg();
        double abs = wow.abs();
        int max = wow.max();
        int min = wow.min();

        System.out.println("Sum: " + sum + "\nDifference: " + dif + "\nProduct: " + pro + "\nAverage: " +
                            avg + "\nAbsolute Value: " + abs + "\nMaximum: " + max + "\nMinimum: " + min);
    }
}
/*
Enter a number between 1 and 13: 13
Enter a number between 2 and 20: 20
Sum: 33
Difference: -7
Product: 260
Average: 16.5
Absolute Value: 7.0
Maximum: 20
Minimum: 13
 */