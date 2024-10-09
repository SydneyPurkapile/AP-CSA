package Q1;
import java.util.*;

public class LP4_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int symbol = ((int)(Math.random()  * 4) + 1);
        int num1 = ((int)(Math.random()  * 10) + 1);
        int num2 = ((int)(Math.random()  * 10) + 1);
        double answer = 0.0;
        if (symbol == 1) {
            System.out.print(num1 + " + " + num2 + " = ");
            answer = num1 + num2;
            if (answer == input.nextDouble()) { System.out.println("Good Job!!!");
            } else System.out.println("Try Again Next Time");
        }
        else if (symbol == 2) {
            System.out.print(num1 + " - " + num2 + " = ");
            answer = num1 - num2;
            if (answer == input.nextDouble()) { System.out.println("Good Job!!!");
            } else System.out.println("Try Again Next Time");
        }
        else if (symbol == 3) {
            System.out.print(num1 + " * " + num2 + " = ");
            answer = num1 * num2;
            if (answer == input.nextDouble()) { System.out.println("Good Job!!!");
            } else System.out.println("Try Again Next Time");
        }
        else {
            System.out.print(num1 + " / " + num2 + " = ");
            answer = num1 / num2;
            if (answer == input.nextDouble()) { System.out.println("Good Job!!!");
            } else System.out.println("Try Again Next Time");
        }
    }
}
/*
1 - 7 = -6
Good Job!!!
 */