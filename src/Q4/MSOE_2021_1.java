package Q4;
import java.util.Scanner;

public class MSOE_2021_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = input.nextLine();
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        for (int i = 0; i < sentence.length()-1; i++) {
            if (sentence.substring(i, i+1).equals(" ")) {
                if (sentence.substring(i-1, i).equals(letter)) {
                    for (int j = i-1; j > 0; j--) {
                        if (sentence.substring(j, j + 1).equals(" ")) {
                            System.out.println("The word is: " + sentence.substring(j + 1, i));
                            return;
                        }
                    }
                }
            }
        }
        System.out.println("There isn't a word ending in " + letter);
    }
}

/*
Enter a letter: y
Enter a sentence: I'm extreamly happy
The word is: extreamly
 */