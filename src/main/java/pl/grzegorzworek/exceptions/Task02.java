package pl.grzegorzworek.exceptions;

public class Task02 {
    public static void main(String[] args) {
        int a = 1, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: You can't divide by 0");
        }
    }
}
