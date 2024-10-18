package Q1.Prog54cClass;
import Q1.Prog52aClass.Class52a;

import java.util.Scanner;

public class Prog54cClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the diameter: ");
        int dim = input.nextInt();

        Class54c wow = new Class54c(dim);
        wow.calc();
        double rad = wow.getRad();
        double area = wow.getArea();
        double circum = wow.getCircum();

        System.out.println("Radius: " + rad);
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circum);
    }
}
/*
Enter the diameter: 2
Radius: 1.0
Area: 3.14159
Circumference: 6.28318
 */