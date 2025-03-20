package Q3.Prog703s;

public class Student implements comp {
    private String name;
    private int number;
    private double value;

    public Student(String n, int num, double v) {
        name = n;
        number = num;
        value = v;
    }

    public String getName() { return name; }
    public int getNumber() { return number; }
    public double getValue() { return value; }
}
