package Q1;
import java.util.*;

public class Prog93a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter kilowatts used: ");
        int kilo = input.nextInt();
        double br = kilo * 0.0475;
        double sc = br * 0.1;
        double ct = br * 0.03;

        System.out.printf("Base Rate: $%.2f\n", br);
        System.out.printf("Surcharge: $%.2f\n", sc);
        System.out.printf("Citytax: $%.2f\n", ct);
        System.out.println("");
        double rbr = Math.round(br * 100.0) / 100.0;
        double rct = Math.round(ct * 100.0) / 100.0;
        double rsc = Math.round(sc * 100.0) / 100.0;

        double pay = rbr + rct + rsc;
        double lpay = pay * 1.04;

        System.out.printf("Pay: $%.2f\n", pay);
        System.out.printf("Late Payment Cost: $%.2f\n", lpay);
    }
}
/*
Enter kilowatts used: 993
Base Rate: $47.17
Surcharge: $4.72
Citytax: $1.42

Pay: $53.31
Late Payment Cost: $55.44
 */