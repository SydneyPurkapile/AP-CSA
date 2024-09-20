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
