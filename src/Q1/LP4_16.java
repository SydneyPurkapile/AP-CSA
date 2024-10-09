package Q1;
import java.util.Scanner;
import java.lang.Math;

public class LP4_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Angle in Degrees: ");
        double degrees = input.nextDouble();
        double angle = Math.toRadians(degrees);
        double sin = Math.sin(angle);
        sin = Math.round(sin * 1000.0) / 1000.0;
        double cos = Math.cos(angle);
        cos = Math.round(cos * 1000.0) / 1000.0;
        double tan = Math.tan(angle);
        tan = Math.round(tan * 1000.0) / 1000.0;
        System.out.println("Sine: " + sin);
        System.out.println("Cosine: " + cos);
        System.out.println("Tangent: " + tan);
    }
}
