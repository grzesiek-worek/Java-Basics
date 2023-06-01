package pl.grzegorzworek.methods;

public class Task10 {
    public static double dogAge(double dogAge){
        if (dogAge <= 2) {
            dogAge *= 10.5;
        } else if (dogAge > 2) {
            dogAge = 2 * 10.5 + (dogAge - 2) * 4;
        }
        return dogAge;
    }

    public static void main(String[] args) {
        System.out.println(dogAge(1.5));
        System.out.println(dogAge(5));
    }
}
