package Q2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465c {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465c.txt"));

            int[][] mat = new int[file.nextInt()][file.nextInt()];
            int et = 0;

            for (int r = 0; r < mat.length; r++) {
                for (int c = 0; c < mat[0].length; c++) {
                    mat[r][c] = file.nextInt();
                    if (r == 0 || r == mat.length-1 || c == 0 || c == mat[0].length-1)
                        et += mat[r][c];
                }
            }

            for (int[] row : mat) {
                for (int num : row)
                    System.out.print(num + " ");
                System.out.println();
            }

            System.out.println();
            System.out.println("Total of the Edges: " + et);

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

/*
100 195 182 225
83 125 235 67
129 42 100 750

Total of the Edges: 1873
 */