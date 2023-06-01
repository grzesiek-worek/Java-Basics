package pl.grzegorzworek.exceptions;

import java.util.NoSuchElementException;

public class Task03 {
    public static int indexOf(int[] elements, int value) {
        for (int i = 0; i < elements.length; i++) {
            if (value == elements[i]) return i;
        }
        throw new NoSuchElementException();
    }

    public static void main(String[] args) {

        int[] myTab = {5,10,15};
        int myValA = 10;
        int myValB = 115;
        try {
            System.out.println(indexOf(myTab, myValA));
            System.out.println(indexOf(myTab, myValB));
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
