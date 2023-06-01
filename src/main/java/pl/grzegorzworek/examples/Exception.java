package pl.grzegorzworek.examples;

public class Exception {

    public static void printMessage(String message) {
        if (message == null) {
            throw new IllegalArgumentException();
        } else {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        try {
            printMessage(null);
        } catch (IllegalArgumentException e){
            System.out.println("Please don't pass null as a method argument");
        }

        int a = 1, b = 0, c;
        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero!!");
        }

        int tab[] = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(tab[1]);
            System.out.println(tab[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}