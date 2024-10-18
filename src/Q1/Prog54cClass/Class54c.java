package Q1.Prog54cClass;

public class Class54c {
    private int mydim;
    private double rad;
    private double area;
    private double circum;
    private double pi;

    public Class54c(int dim) {
        mydim = dim;
        rad = 0;
        area = 0;
        circum = 0;
        pi = 3.14159;
    }

    public void calc() {
        rad = mydim / 2.0;
        area = (Math.pow(rad, 2)) * pi;
        circum = 2 * pi * rad;
    }

    public double getRad() { return rad; }
    public double getArea() { return area; }
    public double getCircum() { return circum; }
}
