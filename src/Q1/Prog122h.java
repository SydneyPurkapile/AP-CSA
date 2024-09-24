package Q1;

public class Prog122h {
    public static void main(String[] args) {
        int lcv1 = 0;
        int lcv2 = 0;
        double lcv3 = 0;
        int lcv4 = 0;
        double lcv5 = 0;
        while (lcv1 < 20) {
            lcv1 += 1;
            lcv2 = (int)Math.pow(lcv1, 2);
            lcv3 = Math.pow(lcv1, 0.5);
            lcv3 = Math.round(lcv3 * 10000.0) / 10000.0;
            lcv4 = (int)Math.pow(lcv1, 3);
            lcv5 = Math.pow(lcv1, 0.25);
            lcv5 = Math.round(lcv5 * 10000.0) / 10000.0;
            System.out.println(lcv1 + "\t\t" + lcv2 + "\t\t" + lcv3 + "\t\t" + lcv4 + "\t\t" + lcv5);
        }
    }
}
