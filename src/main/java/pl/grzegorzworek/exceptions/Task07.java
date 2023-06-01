package pl.grzegorzworek.exceptions;

public class Task07 {
    public static void average(String a, String b) {
        if (a == null){
            throw new IllegalArgumentException();
        } else if (b == null){
            throw new IllegalArgumentException();
        } else {
            System.out.println("Given values for numbers: a=" + a +" i b=" + b);
        }
    }

    public static void main(String[] args) {

        String a = "70";
        String b = "12";

        try {
            average(a,b);

            double newA = Double.parseDouble(a);
            double newB = Double.parseDouble(b);
            double c = newA / newB;

            c = newA/newB;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero!!");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        } finally {
            System.out.println("Section always performed");
        }
    }
}