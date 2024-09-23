package Q1;

public class Prog122a {
    public static void main(String[] args) {
        int lcv1 = 0;
        int lcv2 = 0;
        double lcv3 = 0;
        while (lcv1 < 50) {
            lcv1 += 1;
            lcv2 = (int)Math.pow(lcv1, 2);
            lcv3 = Math.pow(lcv1, 0.5);
            lcv3 = Math.round(lcv3 * 10000.0) / 10000.0;
            System.out.println(lcv1 + "\t\t" + lcv2 + "\t\t" + lcv3);
        }
    }
}
