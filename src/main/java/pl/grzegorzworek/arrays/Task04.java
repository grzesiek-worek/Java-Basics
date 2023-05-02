package pl.grzegorzworek.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {

        int[] numbers = new int[10];
        Random r = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = r.nextInt(101);
        }

        System.out.println("Numbers: " + Arrays.toString(numbers));
        int[] reverse = new int[10]; // or new int[numbers.length];

        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = numbers[(numbers.length - 1) - i]; // 9 - i
        }

        System.out.println("Reverse: " + Arrays.toString(reverse));
    }
}
