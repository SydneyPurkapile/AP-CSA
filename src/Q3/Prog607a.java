package Q3;
import java.util.Scanner;

public class Prog607a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1) Encode Date\n2) Decode Date\n3) Quit");
        System.out.print("Enter Choice: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.print("Enter Date(mm/dd/yy): ");
            String date = input.next();
            String code = "";
            if (date.substring(0, 2).equals("01"))
                code += "A";
            if (date.substring(0, 2).equals("02"))
                code += "B";
            if (date.substring(0, 2).equals("03"))
                code += "C";
            if (date.substring(0, 2).equals("04"))
                code += "D";
            if (date.substring(0, 2).equals("05"))
                code += "E";
            if (date.substring(0, 2).equals("06"))
                code += "F";
            if (date.substring(0, 2).equals("07"))
                code += "G";
            if (date.substring(0, 2).equals("08"))
                code += "H";
            if (date.substring(0, 2).equals("09"))
                code += "I";
            if (date.substring(0, 2).equals("10"))
                code += "J";
            if (date.substring(0, 2).equals("11"))
                code += "K";
            if (date.substring(0, 2).equals("12"))
                code += "L";



            System.out.print("The code is: " + code);
        } else if (choice == 2) {
            System.out.print("Enter Code: ");
            String code = input.next();
            int month = 0;
            int day = 0;
            int year = 0;

            if (code.substring(0, 1).equals("A"))
                month = 1;
            if (code.substring(0, 1).equals("B"))
                month = 2;
            if (code.substring(0, 1).equals("C"))
                month = 3;
            if (code.substring(0, 1).equals("D"))
                month = 4;
            if (code.substring(0, 1).equals("E"))
                month = 5;
            if (code.substring(0, 1).equals("F"))
                month = 6;
            if (code.substring(0, 1).equals("G"))
                month = 7;
            if (code.substring(0, 1).equals("H"))
                month = 8;
            if (code.substring(0, 1).equals("I"))
                month = 9;
            if (code.substring(0, 1).equals("J"))
                month = 10;
            if (code.substring(0, 1).equals("K"))
                month = 11;
            if (code.substring(0, 1).equals("L"))
                month = 12;




            System.out.println("The date is: " + month + "/" + day + "/" + year);
        } else if (choice == 3) {

        }
    }
}
