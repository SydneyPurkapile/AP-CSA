package Q3.Prog703s;

public class Window extends Student {
    private double version;

    public Window(String n, int num, double v, double ver) {
        super(n, num, v);
        version = ver;
    }

    public double getVersion() { return version; }
}
