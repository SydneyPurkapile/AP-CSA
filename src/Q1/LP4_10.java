package Q1;
import java.util.Scanner;

public class LP4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangular Prism");
        System.out.print("Enter Length of Rectangle: ");
        int rl = input.nextInt();
        System.out.print("Enter Width of Rectangle: ");
        int rw = input.nextInt();
        System.out.print("Enter Height of Rectangle: ");
        int rh = input.nextInt();
        int rv = rl * rw * rh;
        System.out.println("The Volume is: " + rv);
        System.out.println("");
        System.out.println("Sphere");
        System.out.print("Enter Radius of Sphere: ");
        int sr = input.nextInt();
        double sv = (3.14159 * Math.pow((sr * 2), 3)) / 6;
        sv = Math.round(sv * 1000.0) / 1000.0;
        System.out.println("The Volume is: " + sv);
        System.out.println("");
        System.out.println("Cube");
        System.out.print("Enter Length of Each Side: ");
        int ss = input.nextInt();
        int sa = ss * ss * ss;
        System.out.println("The Volume is: " + sa);
    }
}
