package Q1;

public class LP5_14 {
    public static void main(String[] args) {
        System.out.println("Dice 1\tDice 2\tTotal");
        int wow = 0;
        while (wow < 5) {
            wow += 1;
            int d1 = ((int)(Math.random()  * 6) + 1);
            int d2 = ((int)(Math.random()  * 6) + 1);
            int total = d1 + d2;
            System.out.println(d1 + "\t\t" + d2 + "\t\t" + total);
        }
    }
}
/*
Dice 1	Dice 2	Total
5		1		6
6		5		11
4		6		10
4		3		7
5		3		8
 */