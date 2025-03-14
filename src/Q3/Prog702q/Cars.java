package Q3.Prog702q;

public class Cars extends Vehicals {
    private double worth;

    public Cars(String n, int t, double v, double w) {
        super(n, t, v);
        worth = w;
    }

    public String getName()  { return name;  }
    public int getTire()     { return tire;  }
    public double getValue() { return value; }
    public double getWorth() { return worth; }
}
