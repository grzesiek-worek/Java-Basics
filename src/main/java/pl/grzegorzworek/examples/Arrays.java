package pl.grzegorzworek.examples;

public class Arrays {

    public static void main(String[] args) {

        int[] myNumbers = new int[5];

        String[] writings = new String[3];

        boolean[] logical = new boolean[4];

        double[] doubles = new double[7];

        System.out.println(java.util.Arrays.toString(myNumbers));
        System.out.println(java.util.Arrays.toString(writings));
        System.out.println(java.util.Arrays.toString(logical));
        System.out.println(java.util.Arrays.toString(doubles));

        int[] numbers = {24, 4, 15, 909, 103};

        String[] cars = {"BMW", "Ferrari", "Fiat", "Ford"};

        System.out.println(java.util.Arrays.toString(numbers));
        System.out.println(java.util.Arrays.toString(cars));

        for (int i = 0; i < cars.length; i++) {
            System.out.println(i);
        }

        System.out.println(cars.length);

        System.out.println(cars[1]);

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = i * 3;
        }

        System.out.println(java.util.Arrays.toString(myNumbers));

        writings[2] = "Hello";

        System.out.println(java.util.Arrays.toString(writings));

        for (String car: cars) {
            System.out.println(car);
        }

        for (int liczba: numbers) {
            System.out.println(liczba);
        }

        String[] myFavouriteCars = cars.clone();

        System.out.println(java.util.Arrays.toString(myFavouriteCars));

        String[] copyOfCars = java.util.Arrays.copyOf(cars, 3);
        String[] newCars = java.util.Arrays.copyOf(cars, 6);

        System.out.println(java.util.Arrays.toString(copyOfCars));
        System.out.println(java.util.Arrays.toString(newCars));

        String[] anotherCopyOfCars = new String[cars.length];

        for (int i = 0; i < cars.length; i++) {
            anotherCopyOfCars[i] = cars[i];
        }

        System.out.println(java.util.Arrays.toString(anotherCopyOfCars));

        java.util.Arrays.fill(doubles, 3.5);

        System.out.println(java.util.Arrays.toString(doubles));

        java.util.Arrays.sort(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
