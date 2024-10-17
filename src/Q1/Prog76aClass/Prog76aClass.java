package Q1.Prog76aClass;
import java.util.Scanner;

public class Prog76aClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number you dislike: ");
        int num = input.nextInt();

        Class76a wow = new Class76a(num);  // New Object on "Class52a" Class
        wow.calc();  // Don't forget to call calc() or setThing()
        int lalala = wow.finalcalc();

        System.out.println(lalala);
        System.out.println("Surprise!!!");
    }
}
/*
Enter a number you dislike: 6
666666666
Surprise!!!
 */