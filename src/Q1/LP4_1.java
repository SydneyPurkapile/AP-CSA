package Q1;
import java.util.Scanner;

public class LP4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of Copies: ");
        int cp = input.nextInt();
        double ppc = 0;
        double tc = 0;
        if (cp < 100) {
            ppc = 0.3;
        }
        else if (cp > 99 && cp < 500) {
            ppc = 0.28;
        }
        else if (cp > 499 && cp < 750) {
            ppc = 0.27;
        }
        else if (cp > 749 && cp < 1001) {
            ppc = 0.26;
        } else ppc = 0.25;
        tc = ppc * cp;
        System.out.println("Price per Copy: $" + ppc);
        System.out.println("Total cost is: $" + tc);
    }
}
