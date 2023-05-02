package pl.grzegorzworek.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task06 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        Random r = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(20);
        }

        int[] secondNumbers = new int[10];

        for (int i = 0; i < secondNumbers.length; i++) {
            secondNumbers[i] = r.nextInt(20);
        }

        int[] sumOfNumbers = new int[10];

        for (int i = 0; i < sumOfNumbers.length; i++) {
            sumOfNumbers[i] = numbers[i] + secondNumbers[i];
        }

        System.out.println("Original numbers: " + Arrays.toString(numbers));
        System.out.println("Second numbers:   " + Arrays.toString(secondNumbers));
        System.out.println("Sum of numbers:   " + Arrays.toString(sumOfNumbers));


    }
}
