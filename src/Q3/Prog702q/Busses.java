package Q3.Prog702q;

public class Busses extends Vehicals {
    private String homeCity;

    public class Busses (String n, int t, double v, String hc) {
        super(n, t, v);
        homeCity = hc;
    }

    public String getName()     { return name;     }
    public int getTire()        { return tires;    }
    public double getValue()    { return value;    }
    public String getHomeCity() { return homeCity; }
}
