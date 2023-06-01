package pl.grzegorzworek.exceptions;

public class Task01 {
    static int factorial(int number) {
        if (number < 0){
            throw new IllegalArgumentException("Number can't be negative!");
        }
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        try {
            System.out.println(factorial(-5));
        } catch (IllegalArgumentException e){
            System.out.println("Please don't give negative values to the factorial method");
        }
    }
}