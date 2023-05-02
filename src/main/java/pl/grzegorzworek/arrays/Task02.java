package pl.grzegorzworek.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        int[] randNumbers = new int[20];

        Random r = new Random();

        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = r.nextInt(101);
        }

        Arrays.sort(randNumbers);
        System.out.println( "Array - " + Arrays.toString(randNumbers));
        System.out.println("Minimum value - " + randNumbers[0]);
    }
}
