package Q1;
import java.util.Scanner;

public class LP4_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchase: ");
        int eggs = input.nextInt();
        int dozen = eggs / 12;
        eggs = eggs % 12;
        double mpd = 0;
        if (dozen < 4) {
            mpd = 0.5;
        }
        else if (dozen >= 4 && dozen < 6) {
            mpd = 0.45;
        }
        else if (dozen >= 6 && dozen < 11) {
            mpd = 0.4;
        }
        else mpd = 0.35;
        double mpde = mpd / 12;
        double dc = mpd * dozen;
        double ec = mpde * eggs;
        double tc = dc + ec;
        System.out.println("The bill is equal to: $" + tc);
    }
}
