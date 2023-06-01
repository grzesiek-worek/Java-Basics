package pl.grzegorzworek.exceptions;

public class Task05 {

    public static int getLength(String str){
        return str.length();
    }

    public static void main(String[] args) {

        String myStrA = "Alphabet";
        String myStrB = null;
        try {
            System.out.println(getLength(myStrA));
            System.out.println(getLength(myStrB));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
