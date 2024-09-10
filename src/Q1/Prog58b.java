package Q1;
import java.util.*;

public class Prog58b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int A = input.nextInt();
        System.out.print("Enter num2: ");
        int B = input.nextInt();
        System.out.print("Enter num3: ");
        int C = input.nextInt();
        double pos = (-B + (Math.sqrt(Math.pow(B, 2) - (4 * A * C)))) / (2 * A);
        double neg = (-B - (Math.sqrt(Math.pow(B, 2) - (4 * A * C)))) / (2 * A);
        System.out.println("The roots are: " + pos + "  " + neg);
    }
}
/*
Enter num1: 1
Enter num2: 5
Enter num3: 6
The roots are: -2.0  -3.0
 */