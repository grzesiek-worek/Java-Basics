package pl.grzegorzworek.methods;

public class Task03 {
    public static double convertToEuro(double pln){
        //4.25 PLN = 1 EUR
        double toEuro = pln / 4.25;
        return toEuro;
    }
    public static void main(String[] args) {
        System.out.println(convertToEuro(25));
    }
}
