package Q2.LP3_14Class;
import java.util.Scanner;

public class LP314 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Election Results for New York: ");
        System.out.print("Awbrey: ");
        int avy = input.nextInt();
        System.out.print("Martinez: ");
        int mvy = input.nextInt();
        System.out.println("Election Results for New Jersey: ");
        System.out.print("Awbrey: ");
        int avj = input.nextInt();
        System.out.print("Martinez: ");
        int mvj = input.nextInt();
        System.out.println("Election Results for Connecticut: ");
        System.out.print("Awbrey: ");
        int avc = input.nextInt();
        System.out.print("Martinez: ");
        int mvc = input.nextInt();

        int at = avy + avj + avc;
        int mt = mvy + mvj + mvc;
        int tv = at + mt;
        double ap = (100.0 / tv) * at;
        ap = Math.round(ap * 100.0) / 100.0;
        double mp = (100.0 / tv) * mt;
        mp = Math.round(mp * 100.0) / 100.0;

        System.out.println("Awbrey: ");
        System.out.println("Votes: " + at);
        System.out.println("Percentage: " + ap);
        System.out.println("Martinez: ");
        System.out.println("Votes: " + mt);
        System.out.println("Percentage: " + mp);
        System.out.println("Total votes: " + tv);
    }
}
/*
Awbrey:
Votes: 616618
Percentage: 49.71
Martinez:
Votes: 623926
Percentage: 50.29
Total votes: 1240544
 */