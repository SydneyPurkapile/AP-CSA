package Q3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog477a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog477a.dat"));
            int[][] mat = new int[3][6];
            System.out.println("Male\tFemale\tTotal");

            while (file.hasNext()) {
                if (file.nextInt() == 1) {
                    mat[0][5]++;
                    if (file.nextInt() == 1)
                        mat[0][0]++;
                    else if (file.nextInt() == 2)
                        mat[0][1]++;
                    else if (file.nextInt() == 3)
                        mat[0][2]++;
                    else if (file.nextInt() == 4)
                        mat[0][3]++;
                    else if (file.nextInt() == 5)
                        mat[0][4]++;
                }
                else if (file.nextInt() == 2) {
                    mat[1][5]++;
                    if (file.nextInt() == 1)
                        mat[1][0]++;
                    else if (file.nextInt() == 2)
                        mat[1][1]++;
                    else if (file.nextInt() == 3)
                        mat[1][2]++;
                    else if (file.nextInt() == 4)
                        mat[1][3]++;
                    else if (file.nextInt() == 5)
                        mat[1][4]++;
                }

                mat[2][0] = mat[0][0] + mat[1][0];
                mat[2][1] = mat[0][1] + mat[1][1];
                mat[2][2] = mat[0][2] + mat[1][2];
                mat[2][3] = mat[0][3] + mat[1][3];
                mat[2][4] = mat[0][4] + mat[1][4];
                mat[2][5] = mat[0][5] + mat[1][5];

                for (int r = 0; r < mat.length; r++) {
                    for (int c = 0; c < mat[0].length; c++)
                        System.out.print(mat[r][c] + " ");
                    System.out.println();
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
