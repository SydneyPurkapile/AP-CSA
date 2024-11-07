package Q2.Prog435g;

public class Class435g {
    private int myScore;
    private int myRank;

    public Class435g(int score) {
        myScore = score;
        myRank = 0;
    }

    public void setRank(int rank) {
        myRank = rank;
    }

    public String toString() {
        return(myScore + "\t\t" + myRank);
    }
}
