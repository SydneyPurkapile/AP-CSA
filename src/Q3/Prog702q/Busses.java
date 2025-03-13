package Q3.Prog702q;

public class Busses implements names{
    private String name;
    private int tires;
    private double value;

    public class Busses (String n, int t, double v) {
        name = n;
        tires = t;
        value = v;
    }

    public String getName() { return name; }
    public int getTire() { return tires; }
    public double getValue() { return value; }
}
