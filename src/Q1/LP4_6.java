package Q1;
import java.util.Random;

public class LP4_6 {
    public static void main(String[] args) {
        int symbol = ((int)(Math.random()  * 4) + 1);
        int num1 = ((int)(Math.random()  * 10) + 1);
        int num2 = ((int)(Math.random()  * 10) + 1);
        System.out.print(num1 + symbol + num2 + " = " );
    }
}
