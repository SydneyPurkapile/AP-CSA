package Q3;
import java.util.Scanner;

public class MSOE_2019_1 {
    public static void main(String[] args) {
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two letters: ");
        String tl = input.nextLine();
        System.out.print("Enter a line of text: ");
        String text = input.nextLine();
        for (int i = 0; i < text.length(); i++) {
            if (text.substring(i, i+1).equals(tl.substring(0, 1))) {
                if (text.substring(i+1, i+2).equals(tl.substring(1)) || text.substring(i-1, i).equals(tl.substring(1))) {
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println("The number of times these letters are seen together is: " + count);
    }
}

/*
Enter two letters: ie
Enter a line of text: theirforeignfield

The number of times these letters are seen together is: 3
 */