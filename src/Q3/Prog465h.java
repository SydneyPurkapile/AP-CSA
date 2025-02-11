package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog465h {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog465h.dat"));
            int[][] mat = new int[file.nextInt()][file.nextInt()];
            int[][] tam = new int[3][3];

            for (int r = 0; r < mat.length; r++)
                for (int c = 0; c < mat[0].length; c++)
                    mat[r][c] = file.nextInt();

            System.out.println("Original");
            for (int[] row : mat) {
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }

            int count = 0;

            for (int c = 0; c < mat.length; c++) {
                if (mat[0][c] == 0)
                    count++;
                else {
                    tam[0][2] = mat[0][c];
                    break;
                }
            }
            tam[0][1] = count+1;
            count = 0;
            tam[0][0] = 1;

            for (int c = 0; c < mat.length; c++) {
                if (mat[1][c] == 0)
                    count++;
                else {
                    tam[1][2] = mat[1][c];
                    break;
                }
            }
            tam[1][1] = count+1;
            count = 0;
            tam[1][0] = 2;

            for (int c = 0; c < mat.length; c++) {
                if (mat[3][c] == 0)
                    count++;
                else {
                    tam[2][2] = mat[3][c];
                    break;
                }
            }
            tam[2][1] = count+1;
            count = 0;
            tam[2][0] = 4;

            System.out.println("New");
            for (int[] row : tam) {
                for (int n : row)
                    System.out.print(n + " ");
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
