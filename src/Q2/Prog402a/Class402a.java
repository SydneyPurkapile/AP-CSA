package Q2.Prog402a;

public class Class402a {
    private int myID;
    private int myScore;
    private double myDiff;

    public Class402a(int ID, int Score) {
        myID = ID;
        myScore = Score;
        myDiff = 0;
    }

    public int getScore() { return myScore; }
    public double getDiff() { return myDiff; }
    public void calc(double avg) { myDiff = myScore - avg; }
    public String toString() { return myID + "\t" + myScore + "\t" + myDiff; }
}
