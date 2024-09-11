package Q1;
import java.util.*;

public class Prog58h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Amount saved: $");
        int P = input.nextInt();
        System.out.print("Interest rate: ");
        double R = input.nextDouble();
        System.out.print("Number of times compounded per year: ");
        int N = input.nextInt();
        System.out.print("Number of days at interest: ");
        int T = input.nextInt();
        double V = (1 + ((.01 * R) / N));
        int G = ((N * T) / 365);
        double K = Math.pow(V, G);
        double A = K * P;
        double M = A - P;
        System.out.printf("The interest earned is: $%.2f\n", M);
        System.out.printf("The total amount in savings is now: $%.2f\n", A);
    }
}
/*
Amount saved: $5000
Interest rate: 11.5
Number of times compounded per year: 365
Number of days at interest: 900
The interest earned is: $1638.96
The total amount in savings is now: $6638.96
 */