package Q2.LP3_9Class;
import java.util.Scanner;

public class LP39 {
    public static void main(String[] args) {
        int days = 0;
        int slept = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birthday: ");
        System.out.print("Month: ");
        int month = input.nextInt();
        System.out.print("Day: ");
        int day = input.nextInt();
        System.out.print("Year: ");
        int year = input.nextInt();
        System.out.println("Enter today's date: ");
        System.out.print("Month: ");
        int tm = input.nextInt();
        System.out.print("Day: ");
        int td = input.nextInt();
        System.out.print("Year: ");
        int ty = input.nextInt();

        int letMeThink = ((30 - day) * 8) + (td * 8);
        letMeThink += (((ty - year - 1) * 365) * 8);
        letMeThink += ((12 - month) * 30 * 8) + (tm * 30 * 8);

        System.out.println("Days Alive: " + letMeThink/8);
        System.out.println("Time Slept: " + letMeThink);

}
}
