package Q2.LP3_10Class;
import java.util.Scanner;

public class LP3_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of burgers: ");
        double BC = input.nextDouble();
        System.out.print("Enter the amount of fries: ");
        double FC = input.nextDouble();
        System.out.print("Enter the amount of sodas: ");
        double SC = input.nextDouble();

        BC *= 1.69;
        FC *= 1.09;
        SC *= 0.99;

        double tbt = BC + FC + SC;
        tbt = Math.round(tbt * 100.0) / 100.0;
        double tax = tbt * 0.065;
        tax = Math.round(tax * 100.0) / 100.0;
        double ft = tbt + tax;
        ft = Math.round(ft * 100.0) / 100.0;

        System.out.println();
        System.out.println("Total before tax: " + tbt);
        System.out.println("Tax: " + tax);
        System.out.println("Final total: " + ft);
    }
}
/*
Enter the amount of burgers: 2
Enter the amount of fries: 5
Enter the amount of sodas: 5
Total before tax: 13.78
Tax: 0.9
Total: 14.68
 */