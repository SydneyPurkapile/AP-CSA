package Q1;

public class Prog122c {
    public static void main(String[] args) {
        int lcv1 = 0;
        int lcv2 = 0;
        int lcv3 = 0;
        int lcv4 = 0;
        while (lcv1 < 10) {
            lcv1 += 2;
            lcv2 = lcv1 + 1;
            lcv3 = lcv1 * 2;
            lcv4 = (int)Math.pow(lcv1, 2);
            System.out.println(lcv1 + "\t\t" + lcv2 + "\t\t" + lcv3 + "\t\t" + lcv4);
        }
    }
}
