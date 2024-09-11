package Q1;

public class Prog88a {
    public static void main(String[] args) {
        // Enter number 1-13
        // Enter number 2-20
        // Math.random() * (max - min) + min
        int num1 = (int) (Math.random() * (13 - 1)) + 1;
        int num2 = (int) (Math.random() * (20 - 2)) + 2;
        int sum = num1 + num2;
        int dif = num1 - num2;
        int pro = num1 * num2;
        double avg = sum / 2.0;
        int abs = Math.abs(dif);
        int max, min;

        if (num1 > num2) {
            max = num1;
            // min = num2
        } else {
            max = num2;
            // min = num1
        }

        if (max == num1) {
            min = num2;
        } else {
            min = num1;
        }

        System.out.println("Original numbers are: " + num1 + " and " + num2);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + dif);
        System.out.println("Product: " + pro);
        System.out.println("Average: " + avg);
        System.out.println("Absolute Value: " + abs);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
/*
Original numbers are: 11 and 12
Sum: 23
Difference: -1
Product: 132
Average: 11.5
Absolute Value: 1
Maximum: 12
Minimum: 11
 */