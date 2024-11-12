package Q2;

public class BigArray {
    public static void main(String[] args) {
        int[] array = new int[19];
        for (int lcv = 0; lcv < array.length; lcv++)
            array[lcv] = (int) (Math.random() * (91 - 20) + 20);  // random * (max-min) + min

    // Step 1
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    // Step 2
        for (int temp : array) // For every int in array
            System.out.print(temp + " ");
        System.out.println();
    // Step 3
        System.out.println("The middle number is: " + array[array.length / 2]);
    // Step 4
        double avg = array[0] + array[array.length-1] + array[array.length/2];
        System.out.println("Average of first, middle, and last numbers: " + (avg/3));
    // Step 5
        int smallest = array[0];
        int largest = array[0];
        for (int num : array) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    // Step 6
        int smallIndex = -1;
        int largeIndex = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallest) smallIndex = i;
            if (array[i] == largest) largeIndex = i;
        }
        int tempswap = array[smallIndex];
        array[smallIndex] = array[largeIndex];
        array[largeIndex] = tempswap;
        for (int x : array) System.out.print(x + " ");
        System.out.println();
    // Step 7
        int randNum = (int) (Math.random() * 10 + 1);
        array[array.length/2] = randNum;
        for (int x : array) System.out.print(x + " ");
        System.out.println();
    // Step 8
        for (int i = 0; i < array.length; i++)
            array[i] += 10;
        for (int x : array) System.out.print(x + " ");
        System.out.println();
    // Step 9
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was ousted: " + myThird);
    // Step 10
        for (int num : array)
            if (num >= 50 && num <= 59)
                System.out.print(num + " ");
        System.out.println();
    // Step 11
        for (int i = 0; i < array.length; i++)
            if (array[i] % 4 == 0)
                System.out.print(array[i] + " ");
        System.out.println();
    // Step 12
        boolean sixty = false;
        for (int n : array)
            if (n == 60)
                sixty = true;
        System.out.println("Is 60 in the list: " + sixty);
    // Step 13
        boolean same = true;
        for (int lcv = 0; lcv < array.length; lcv++)
            if (array[lcv] != array[(array.length-1) - lcv])
                same = false;
        System.out.println("Is the array palindromic: " + same);
    // Step 14
        double average = 0;
        for (int x : array)
            average += x;
        average /= array.length;
        int avgCount = 0;
        for (int x : array)
            if (x > average)
                avgCount++;
        System.out.printf("There are %d numbers greater than the average\n", avgCount);
    // Step 15
        int evens = 0;
        for (int num : array)
            if (num %2 == 0)
                evens++;
        System.out.printf("There are %d even numbers\n", evens);
    // Step 16
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++)
            array2[i] = array[(array.length-1) - i];
        for (int n : array2)
            System.out.print(n + " ");
        System.out.println();
    // Step 17
        int[] shiftArr = circularShiftRight(array);
        for (int n : shiftArr)
            System.out.print(n + " ");
        System.out.println();
    // Step 18
        int sum = 0;
        for (int num : array) {
            int digitsum = 0;
            int temp = num;
            while (temp > 0) {
                int n = temp % 10;
                temp /= 10;
                digitsum += n;
            }
            sum += digitsum;
        }
        System.out.println("Sum of all digits of all elements: " + sum);
    }
    // For Step 17
    public static int[] circularShiftRight(int[] arr) {
        int temp = arr[arr.length - 1];
        int[] shifted = new int[arr.length];
        for (int lcv = 1; lcv < arr.length; lcv++)
            shifted[lcv] = arr[lcv-1];
        shifted[0] = temp;
        return(shifted);
    }
}
/*
65 77 45 70 26 72 25 31 26 54 41 76 69 73 60 26 89 49 33
65 77 45 70 26 72 25 31 26 54 41 76 69 73 60 26 89 49 33
The middle number is: 54
Average of first, middle, and last numbers: 50.666666666666664
Smallest number: 25
Largest number: 89
65 77 45 70 26 72 89 31 26 54 41 76 69 73 60 26 25 49 33
65 77 45 70 26 72 89 31 26 6 41 76 69 73 60 26 25 49 33
75 87 55 80 36 82 99 41 36 16 51 86 79 83 70 36 35 59 43
The number that was ousted: 55
51 59
80 36 36 16 36
Is 60 in the list: false
Is the array palindromic: false
There are 10 numbers greater than the average
There are 8 even numbers
43 59 35 36 70 83 79 86 51 16 36 41 99 82 36 80 5 87 75
43 75 87 5 80 36 82 99 41 36 16 51 86 79 83 70 36 35 59
Sum of all digits of all elements: 190
 */