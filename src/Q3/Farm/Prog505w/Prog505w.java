package Q3.Farm.Prog505w;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/*public class Prog505w {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("Langdat/prog505w.dat"));
            List<Animal> animals = new ArrayList<Animal>();

            int hay = file.nextInt();
            double hayCost = file.nextDouble();
            int corn = file.nextInt();
            double cornCost = file.nextDouble();

            int cowRows = file.nextInt();
            int cowPens = file.nextInt();
            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = file.next();
                    int weight = file.nextInt();
                    int milk = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    Cow wow = new Cow(name, weight, milk, cornEaten, hayEaten);
                    animals.add(wow);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

            int horseRows = file.nextInt();
            int horsePens = file.nextInt();
            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = file.next();
                    int weight = file.nextInt();
                    int hayEaten = file.nextInt();
                    int cornEaten = file.nextInt();
                    int rides = file.nextInt();
                    double rideCost = file.nextDouble();
                    Horse fred = new Horse(name, weight, cornEaten, hayEaten, rides, rideCost);
                    animals.add(fred);
                    hay -= hayEaten;
                    corn -= cornEaten;
                }
            }

<<<<<<< HEAD
            int income = 0;
            double minHorseValue = Double.MAX_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    double horseValue = horse.value(cornCost, hayCost);
                    income += horseValue;
                }
            }
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    double cowValue = cow.value(cornCost, hayCost);
                    income += cowValue;
                }
            }

            double totWeight = 0.0;
            for (int lcv = 0; lcv < animals.size(); lcv++)
                if (animals.get(lcv) instanceof Cow) {
                    totWeight += Animal.getWeight();
                }
            for (int lcv = 0; lcv < animals.size(); lcv++)
                if (animals.get(lcv) instanceof Horse) {
                    totWeight += Animal.getWeight();
                }
            System.out.println("Total Weight: " + totWeight);
=======
            // TODO: report income of the day
            double totalIncome = 0.0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
             //   if (animals.get(lcv) instanceof Cow)
                   // totalIncome += Cow.value(cornCost, hayCost);
              //  if (animals.get(lcv) instanceof Horse)
                   // totalIncome += Horse.value(cornCost, hayCost);
            }


            // TODO: cumulative weight of all animals
            //int totalWeight = 0;
            //for (int lcv = 0; lcv < animals.size(); lcv++) {
                //totalWeight += (Horse).getWeight();
            //}
            System.out.println("The total weight of all the animals is: " + totalWeight);
>>>>>>> 6080bc01717a0571405af35a0d4f1482fa3c303c

            if (corn > cow+horse && hay > cow+horse)
                System.out.println("There is enough food!");
            else   
                System.out.println("There is not enough food");

            int maxCowIndex = 0;
            double maxCowValue = 0.0;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Cow) {
                    Cow cow = (Cow) animals.get(lcv);
                    double cowValue = cow.value(cornCost, hayCost);
                    if (cowValue < maxCowValue) {
                        maxCowIndex = lcv;
                        maxCowValue = cowValue;
                    }
                }
            }
            System.out.printf("Cow %s makes the most money\n", animals.get(maxCowIndex).getName());

            int minHorseIndex = 0;
            double minHorseValue = Double.MAX_VALUE;
            for (int lcv = 0; lcv < animals.size(); lcv++) {
                if (animals.get(lcv) instanceof Horse) {
                    Horse horse = (Horse) animals.get(lcv);
                    double horseValue = horse.value(cornCost, hayCost);
                    if (horseValue < minHorseValue) {
                        minHorseIndex = lcv;
                        minHorseValue = horseValue;
                    }
                }
            }
            System.out.printf("Horse %s makes the least money\n", animals.get(minHorseIndex).getName());

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
*/