package Q1;
import java.util.*;

public class Prog58t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price: $");
        double price = input.nextDouble();
        System.out.print("Enter amount given: $");
        double given = input.nextDouble();
        double change = given - price;
        System.out.printf("Change: $%.2f\n", change);

        int dollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        while (change > 1) {
            dollars += 1;
            change -= 1;
        }
        while (change > .25) {
            quarters += 1;
            change -= .25;
        }
        while (change > .10) {
            dimes += 1;
            change -= .10;
        }
        while (change > .05) {
            nickels += 1;
            change -= .05;
        }
        while (change > 0.01) {
            pennies += 1;
            change -= 0.01;
        }

        System.out.println("Dollars: " + dollars);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}
/*
Enter price: $125.32
Enter amount given: $140
Change: $14.68
Dollars: 14
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 3
 */