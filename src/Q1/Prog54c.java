package Q1;

import java.util.Scanner;

public class Prog54c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Diameter: ");
        double dia = input.nextInt();
        double rad = dia / 2;
        // pi r^2
        // 2pi r
        double pi = 3.14159;
        double area = pi * (rad * rad);
        double circ = 2 * pi * rad;

        System.out.println("Radius: " + rad);
        System.out.printf("Area: %.1f\n", area);
        System.out.printf("Circumference: %.1f\n", circ);
    }
}
/*
Enter Diameter: 6
Radius: 3.0
Area: 28.3
Circumference: 18.8
 */