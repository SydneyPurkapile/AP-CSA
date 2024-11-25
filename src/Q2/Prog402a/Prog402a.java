package Q2.Prog402a;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog402a {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prg402a.dat"));
            System.out.println("ID\tScore\tDiff");
            double avg = 0;
            int place = 0;
            Class402a[] stuArr = new Class402a[21];
            while (file.hasNext()) {
                int ID = file.nextInt();
                int Score = file.nextInt();
                Class402a stu = new Class402a(ID, Score);
                stuArr[place] = stu;
                place++;
            }

            for (Class402a l : stuArr)
                avg += l.getScore();
            avg /= 21.0;
            for (Class402a l : stuArr) {
                l.calc(avg);
                System.out.println(l);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
/*
ID	Score	Diff
115	257	14.38095238095238
123	253	10.38095238095238
116	246	3.3809523809523796
113	243	0.3809523809523796
112	239	-3.6190476190476204
104	239	-3.6190476190476204
110	238	-4.61904761904762
218	243	0.3809523809523796
208	242	-0.6190476190476204
222	223	-19.61904761904762
223	230	-12.61904761904762
213	229	-13.61904761904762
207	228	-14.61904761904762
203	224	-18.61904761904762
305	265	22.38095238095238
306	262	19.38095238095238
311	256	13.38095238095238
325	246	3.3809523809523796
321	245	2.3809523809523796
323	245	2.3809523809523796
301	242	-0.6190476190476204
 */