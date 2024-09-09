package Q1;
import java.util.*;

public class Prog52aInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int len = input.nextInt();
        System.out.print("Enter Width: ");
        int wid = input.nextInt();
        int area = len * wid;
        int perim = len * 2 + wid * 2;
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perim);
    }
}
/*
Enter Length: 4
Enter Width: 4
Area: 16
Perimeter: 16
 */