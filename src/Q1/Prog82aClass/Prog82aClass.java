package Q1.Prog82aClass;
import Q1.Prog52aClass.Class52a;

import java.util.Scanner;

public class Prog82aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed limit: ");
        int speedl = input.nextInt();
        System.out.print("Enter the vehicle speed: ");
        int speed = input.nextInt();

        Class82a wow = new Class82a(speed, speedl);
        wow.calc();
        int fine = wow.getFine();

        System.out.println("Fine: $" + fine);
    }
}
/*
Enter the speed limit: 30
Enter the vehicle speed: 42
Fine: $80
 */