package Q1.Prog76aClass;

public class Class76a {
    private int first;
    private int last;
    private int numm;

    public Class76a(int num) {
        first = 0;
        last = 0;
        numm = num;
    }
    public void calc() {
        first = numm * 9;
        last = first * 12345679;
    }

    public int finalcalc()  {  return last;  }

}
