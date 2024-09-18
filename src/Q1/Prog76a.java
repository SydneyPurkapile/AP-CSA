package Q1;
import java.util.*;

public class Prog76a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Least Favorite Single Digit Number: ");
        int lfn = input.nextInt();
        int lfn9 = lfn * 9;
        System.out.println(lfn + " x 9 = " + lfn9);
        int lfnr = lfn9 * 12345679;
        System.out.println(lfn9 + " x 12345679 = " + lfnr);
        System.out.println("Suprise!");
    }
}
/*
Enter Least Favorite Single Digit Number: 6
6 x 9 = 54
54 x 12345679 = 666666666
Suprise!
 */