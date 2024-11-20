package Q2.Prog402a;

public class Class402a {
    private int myID;
    private int myScore;
    private double myAvg;
    private double myDiff;

    public Class402a(int ID, int Score, double avg) {
        myID = ID;
        myScore = Score;
        myAvg = avg;
        myDiff = 0;
    }

    public void calc() {
        myDiff = myScore - myAvg;
    }


}
