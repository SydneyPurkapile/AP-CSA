package Q3.Prog702q;

public class Busses extends Vehicals {
    private String homeCity;

    public Busses(String n, int t, double v, String hc) {
        super(n, t, v);
        homeCity = hc;
    }

    public String getHomeCity() { return homeCity; }
}
