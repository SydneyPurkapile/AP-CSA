package Q2;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class BigArrayListCat {
    public static void printCat(Cat cat) {
        System.out.printf("%s\t%.2f\t%d\t$%.2f\n", cat.getName(), cat.getWeight(), cat.getAge(), cat.getCost());
    }

    public static void main(String[] args) {
    try {
        Scanner file = new Scanner(new File("Langdat/bigarraylist.dat"));
        int numCats = file.nextInt();
        file.nextLine();
        ArrayList<Cat> cats = new ArrayList<>();

        for (int lcv = 0; lcv < numCats; lcv++) {
            String n = file.nextLine();
            double w = file.nextDouble();
            int a = file.nextInt();
            double c = file.nextDouble();
            file.nextLine();
            cats.add(new Cat(n, w, a, c));
        }

    // Step 1
        System.out.println("ALL THE CATS");
        System.out.println("Name\tWeight\tAge\tCost");
        for (Cat cat : cats)
            printCat(cat);
    // Step 2
        System.out.println();
        System.out.println("THE THIRD CAT'S NAME");
        System.out.println("The third cat's name is: " + cats.get(2).getName());
    // Step 3
        System.out.println();
        System.out.println("UPDATE THE WEIGHT");
        cats.get(cats.size()-1).setWeight(cats.get(cats.size()-1).getWeight() + 10);
        System.out.println("Updated weight: " + cats.get(cats.size()-1).getWeight());
    // Step 4
        System.out.println();
        System.out.println("REMOVE RASCAL");
        for (int i = 0; i < cats.size(); i++)
            if (cats.get(i).getName().equals("Rascal"))
                cats.remove(i);
        System.out.println("Cat has been removed");
    // Step 5
        System.out.println();
        System.out.println("NEW KITTEN ANGEL");
        cats.add(1, new Cat("Angel", 3.6, 1, 25.99));
        System.out.println("Cat has been added");
    // Step 6
        System.out.println();
        System.out.println("FOUND A GERIATRIC CAT");
        cats.add(new Cat("Gimpy", 14.3, 10, 29.99));
        System.out.println("Cat had been added");
    // Step 7
        System.out.println();
        System.out.println("UPDATED LIST");
        System.out.println("The most recent version of the list is:");
        System.out.println("Name\tWeight\tAge\tCost");
        for (Cat cat : cats)
            printCat(cat);
    // Step 8
        System.out.println();
        System.out.println("REPLACE THE THIRD CAT");
        Cat third = cats.get(2);
        cats.set(2, new Cat("Sugar", 23.6, 7, 33.25));
        cats.add(third);
        System.out.println("Cat has been replaced");
    // Step 9
        System.out.println();
        System.out.println("SWITCH THE 2ND AND 4TH CATS");
        Cat temp = cats.get(1);
        cats.set(1, cats.get(3));
        cats.set(3, temp);
        System.out.println("Cats have been switched");
    // Step 10
        System.out.println();
        System.out.println("CAT NAMES");
        System.out.println("Current cat names: ");
        for (Cat c : cats)
            System.out.print(c.getName() + "\t");
        System.out.println();
    // Step 11
        System.out.println();
        System.out.println("REMOVE ALL CATS UNDER $26");
        for (int i = 0; i < cats.size(); i++) {
            if (cats.get(i).getCost() < 26) {
                cats.remove(i);
                i--;  // IMPORTANT: never forget to do this
            }
        }
        System.out.println("Costs of the remaining cats: ");
        for (Cat c : cats)
            System.out.print(c.getCost() + "\t");
        System.out.println();
    // Step 12
        System.out.println();
        System.out.println("CATS PUT ON A DIET");
        System.out.println("Cats being put on a diet: ");
        for (int lcv = 0; lcv < cats.size(); lcv++) {
            Cat c = cats.get(lcv);
            if (c.getWeight() > 15)
                System.out.print(c.getName() + "\t");
        }
        System.out.println();

    } catch (IOException e) {
        System.out.println("Error: " + e);
    }
}
}
