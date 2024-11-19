package Q2.MSOE_2016;
import java.util.Scanner;

public class MSOE_2016_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a lowercase word: ");
        String word = input.nextLine();
        for (int k = 0; k < word.length(); k++) {
            if (word.substring(k, k+1) == word.substring(word.length()-k))
                System.out.println("Yes");
        }
        System.out.println("No");
    }
}
