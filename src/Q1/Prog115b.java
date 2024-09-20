package Q1;
import java.util.*;

public class Prog115b {
    public static void main(String[] args) {
        int lcv = 0;
        List<Integer> list = new ArrayList<Integer>();
        while (lcv < 36) {
            lcv += 2;
            list.add(lcv);
        }
        System.out.println(list);
    }
}
/*
[2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36]
 */