package Q4;
import java.util.Scanner;

public class MSOE_2022_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int grams = 0;
        int buckets = 0;
        System.out.print("How many sea shells do you want: ");
        int num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("How many grams should it be: ");
            grams += input.nextInt();
        }
        while (grams > 0) {
            buckets++;
            grams -= 100;
        }
        System.out.println("She will need " + buckets + " buckets");
    }
}
/*
How many sea shells do you want: 3
How many grams should it be: 50
How many grams should it be: 100
How many grams should it be: 25
She will need 2 buckets
 */