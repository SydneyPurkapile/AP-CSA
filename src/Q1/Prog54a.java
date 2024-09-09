package Q1;
import java.util.*;

public class Prog54a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Miles: ");
        int mil = input.nextInt();
        System.out.print("Enter Gallons: ");
        int gal = input.nextInt();
        double mg = (double)mil / gal;
        System.out.println();
        System.out.printf("mpg = %.1f\n", mg);
    }
}
/*
Enter Miles: 412
Enter Gallons: 40

mpg = 10.3
 */