package Q3.Prog702q;

public class Cars extends Vehicals {
    private double worth;

    public Cars(String n, int t, double v, double w) {
        super(n, t, v);
        worth = w;
    }

    public double getWorth() { return worth; }
}
