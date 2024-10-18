package Q1.Prog54bClass;

public class Class54b {
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int sum;
    private double avg;

    public Class54b(int num1, int num2, int num3, int num4) {
        n1 = num1;
        n2 = num2;
        n3 = num3;
        n4 = num4;
        sum = 0;
        avg = 0;
    }

    public void calc() {
        sum = n1 + n2 + n3 + n4;
        avg = sum / 4.0;
    }

    public int getSum() { return sum; }
    public double getAvg() { return avg; }
}
