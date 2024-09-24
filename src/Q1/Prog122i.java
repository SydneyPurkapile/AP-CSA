package Q1;

public class Prog122i {
    public static void main(String[] args) {
        int lcv1 = -26;
        double lcv2 = 0;
        int lcv3 = 0;
        while (lcv1 < 25) {
            lcv1 += 1;
            lcv2 = Math.pow(lcv1, 0.333333);
            lcv3 = (int)Math.pow(lcv1, 3);
            lcv2 = Math.round(lcv2 * 100000.0) / 100000.0;
            System.out.println(lcv1 + "\t\t" + lcv2 + "\t\t" + lcv3);
        }
    }
}
