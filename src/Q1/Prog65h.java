package Q1;
import java.util.*;

public class Prog65h {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Pounds: ");
        int pounds = input.nextInt();
        System.out.print("Shillings: ");
        int shillings = input.nextInt();
        System.out.print("Pence: ");
        int pence = input.nextInt();

        double ns = shillings * 4.7;
        double nsp = ns + pence;
        nsp /= 100;
        double total = nsp + pounds;
        double rtotal = Math.round(total * 100.0) / 100.0;

        System.out.println("Decimal Pounds: " + rtotal);
    }
}
/*
Pounds: 7
Shillings: 17
Pence: 9
Decimal Pounds: 7.89
 */