package Q1.Prog54bClass;
import Q1.Prog52aClass.Class52a;

import java.util.Scanner;

public class Prog54bClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a number: ");
        int num2 = input.nextInt();
        System.out.print("Enter a number: ");
        int num3 = input.nextInt();
        System.out.print("Enter a number: ");
        int num4 = input.nextInt();

        Class54b wow = new Class54b(num1, num2, num3, num4);  // New Object on "Class52a" Class
        wow.calc();  // Don't forget to call calc() or setThing()
        int sum = wow.getSum();
        double avg = wow.getAvg();

        System.out.println("The sum of the four numbers is: " + sum);
        System.out.println("The average of the four numbers is: " + avg);
    }
}
/*
Enter a number: 475
Enter a number: 821
Enter a number: 369
Enter a number: 562
The sum of the four numbers is: 2227
The average of the four numbers is: 556.75
 */