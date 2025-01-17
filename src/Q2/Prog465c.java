package Q2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));

            int[][] mat = new int[file.nextInt()][file.nextInt()];
            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[0].length-1; c++)
                    mat[r][c] = file.nextInt();

            for (int[] row : mat) {
                for (int num : row)
                    System.out.print(num + " ");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
