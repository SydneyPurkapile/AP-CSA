package Q3.Prog703s;

public class Linux extends Student {
    private int code;

    public Linux(String n, int num, double v, int c) {
        super(n, num, v);
        code = c;
    }

    public int getCode() { return code; }
}
