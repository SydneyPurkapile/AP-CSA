package Q4;
import java.util.Scanner;

public class Jeff {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("My name is Jeff");

        String favColor = "green";
        String favAnimal = "sea otter";
        String favFood = "french fries";
        String middleName = "James";
        String lastName = "Szelogowski";
        String favClass = "algebra one";
        String favActivity = "torturing my students";
        String occupation = "high school teacher";
        String favSport = "golf";
        String worstFear = "touching grass";
        String favPastTime = "playing poker";

        System.out.println("What would you like to ask me?");
        System.out.println("0) full name");
        System.out.println("1) favorite color");
        System.out.println("2) favorite animal");
        System.out.println("3) favorite food");
        System.out.println("4) favorite class");
        System.out.println("5) favorite activity");
        System.out.println("6) occupation");
        System.out.println("7) favorite sport");
        System.out.println("8) worst fear");
        System.out.println("9) favorite past time");
        System.out.println("10) hear a joke");

        int choice = input.nextInt();

        if (choice == 0)
            System.out.println("Jeff " + middleName + " " + lastName);
        else if (choice == 1)
            System.out.println("My favorite color is: " + favColor);
        else if (choice == 2)
            System.out.println("My favorite animal is: " + favAnimal);
        else if (choice == 3)
            System.out.println("My favorite food is: " + favFood);
        else if (choice == 4)
            System.out.println("My favorite class is: " + favClass);
        else if (choice == 5)
            System.out.println("My favorite activity is: " + favActivity);
        else if (choice == 6)
            System.out.println("My occupation is: " + occupation);
        else if (choice == 7)
            System.out.println("My favorite sport is: " + favSport);
        else if (choice == 8)
            System.out.println("My worst fear is: " + worstFear);
        else if (choice == 9)
            System.out.println("My favorite past time is: " + favPastTime);
        else if (choice == 10) {
            int num = (int) (Math.random() * 3) + 1;
            if (num == 1)
                System.out.println("I heard a joke about a jump rope, but I think I'll skip that one");
            else if (num == 2)
                System.out.println("I went to the beekeeper the other day to buy 12 bees. He gave me 13. And I said, but, sir I only paid you for 12. He said, well, that's a free bee.");
            else
                System.out.println("Look in a mirror");
        }
        else
            System.out.println("That isn't a choice!");
    }
}
