package Q1.Prog88aClass;

public class Class88a {
    private int sum;
    private int dif;
    private int pro;
    private double avg;
    private int abs;
    private int max;
    private int min;
    private int mynum1;
    private int mynum2;

    public Class88a(int num1, int num2) {
        mynum1 = num1;
        mynum2 = num2;
        sum = 0;
        dif = 0;
        pro = 0;
        avg = 0;
        abs = 0;
        max = 0;
        min = 0;
    }

    public void calc() {
        sum = mynum1 + mynum2;
        dif = mynum1 - mynum2;
        pro = mynum1 * mynum2;
        avg = ((double)mynum1 + mynum2) / 2;
        abs = Math.abs(dif);
        if (mynum1 > mynum2) {
            max = mynum1;
            min = mynum2;
        }
        else max = mynum2; min = mynum1;
    }

    public int sum()  {return sum;}
    public int dif()  {return dif;}
    public int pro()  {return pro;}
    public double avg()  {return avg;}
    public double abs()  {return abs;}
    public int max()  {return max;}
    public int min()  {return min;}
}
