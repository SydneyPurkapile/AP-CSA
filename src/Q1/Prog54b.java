package Q1;
import java.util.*;

public class Prog54b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input.nextInt();
        System.out.print("Enter num4: ");
        int num4 = input.nextInt();
        System.out.println();
        int sum = num1 + num2 + num3 + num4;
        int avg = sum / 4;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
    }
}
/*
Enter num1: 2
Enter num2: 2
Enter num3: 2
Enter num4: 2

Sum: 8
Average: 2
 */