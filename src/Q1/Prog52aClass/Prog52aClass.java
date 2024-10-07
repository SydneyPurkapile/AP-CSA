package Q1.Prog52aClass;
import java.util.Scanner;

public class Prog52aClass {  // Driver Class (main)
    public static void main(String[] args) {
        // Input Section
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = input.nextInt();
        System.out.print("Enter Width: ");
        int w = input.nextInt();

        // Calculation Section
        Class52a wow = new Class52a(l, w);  // New Object on "Class52a" Class
        wow.calc();  // Don't forget to call calc() or setThing()
        int area = wow.getArea();
        int perim = wow.getPerim();

        // Output Section
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perim);
    }
}
/*
Enter Length: 5
Enter Width: 3
Rectangle Area: 15
Rectangle Perimeter: 16
 */