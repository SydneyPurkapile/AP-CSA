public class Apple implements Comp {
    private String color;

    public class Apple(String n, int num, double v, String c) {
        super(n, num, v);
        color = c;
    }

    public String getColor() { return color; }
}
