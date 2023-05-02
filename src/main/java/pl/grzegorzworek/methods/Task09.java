package pl.grzegorzworek.methods;

public class Task09 {
    public static String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(10));
        System.out.println(checkEvenOdd(7));
    }
}
