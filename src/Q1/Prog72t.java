package Q1;
import java.util.Scanner;
public class Prog72t {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first time: ");
        int ftime = input.nextInt();
        System.out.print("Enter the second time: ");
        int stime = input.nextInt();
        int timef = ftime / 100;
        int times = stime / 100;
        int hours = Math.abs(timef - times);
        System.out.print(hours + "hours and ");
        int min = ftime - stime;
        hours *= 100;
        min = Math.abs(min + hours);
        System.out.print(min + " minutes");
    }
}
/*
Enter the first time: 900
Enter the second time: 1730
8hours and 30 minutes
 */