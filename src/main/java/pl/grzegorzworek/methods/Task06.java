package pl.grzegorzworek.methods;

public class Task06 {
    public static double calculateNet(double gross, double tax){

        double net = gross / (1 + tax);
        return net;
    }

    public static void main(String[] args) {
        System.out.println(calculateNet(123, 0.23));
    }
}
