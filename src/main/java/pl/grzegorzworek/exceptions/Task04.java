package pl.grzegorzworek.exceptions;

public class Task04 {

    public static int toInt(String str){
        return Integer.parseInt(str);
    }
    public static void main(String[] args) {
        String napis1 = "123";
        String napis2 = "Alfa";
        try {
            System.out.println(toInt(napis1));
            System.out.println(toInt(napis2));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(e);
            e.printStackTrace();
        }
    }
}