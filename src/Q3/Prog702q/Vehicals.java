package Q3.Prog702q;

public class Vehicals implements names{
    private String name;
    private int tire;
    private double value;

    public Vehicals(String n, int t, double v) {
        name = n;
        tire = t;
        value = v;
    }

    public String getName()  { return name;  }
    public int getTire()     { return tire;  }
    public double getValue() { return value; }

}
