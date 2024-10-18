package Q1.Prog82aClass;

public class Class82a {
    private int myspeed;
    private int myspeedl;
    private int fine;
    private int dif;

    public Class82a(int speed, int speedl) {
        myspeed = speed;
        myspeedl = speedl;
        fine = 20;
        dif = 0;
    }

    public void calc() {
        dif = myspeed - myspeedl;
        fine += (dif * 5);
    }

    public int getFine() { return fine; }
}
