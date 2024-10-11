package Q1;

public class LP5_9 {
    public static void main(String[] args) {
        System.out.println("x^1\t\tx^2\t\tx^3\t\tx^4\t\tx^5");
        int wow = 0;
        int num = 0;
        int sqr = 0;
        int cube = 0;
        int four = 0;
        int five = 0;
        while (wow < 6) {
            wow += 1;
            num += 1;
            sqr = (int)Math.pow(num, 2);
            cube = (int)Math.pow(num, 3);
            four = (int)Math.pow(num, 4);
            five = (int)Math.pow(num, 5);
            System.out.println(num + "\t\t" + sqr + "\t\t" + cube + "\t\t" + four + "\t\t" + five);
        }
    }
}
