package Q3.Prog702q;

public class Trucks extends Vehicals {
    private int miles;

    public Trucks(String n, int t, double v, int m) {
        super(n, t, v);
        miles = m;
    }


    public String getName()  { return name;  }
    public int getTire()     { return tires; }
    public double getValue() { return value; }
    public int getMiles()    { return miles; }
}
