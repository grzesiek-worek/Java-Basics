package pl.grzegorzworek.examples;

import java.util.Arrays;

public class Variables {
    public static void main(String[] args) {
        int number;
        number = 55;
        System.out.println(number);
        number = 44;
        System.out.println(number);

        int secondNumber = 77;
        System.out.println(secondNumber);

        double weight = 77.45;
        System.out.println(weight);

        String name = "Grzegorz";
        System.out.println(name);

        Character myChar = 'd';
        System.out.println(myChar);

        boolean logicValue = true;
        System.out.println(logicValue);

        int[] myArray = new int[3];
        System.out.println(Arrays.toString(myArray));

        Person person = new Person();
        System.out.println(person);
    }
}