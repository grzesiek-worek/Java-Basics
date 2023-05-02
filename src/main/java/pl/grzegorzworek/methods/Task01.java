package pl.grzegorzworek.methods;

public class Task01 {
    public static int multiply(int multiplier, int index){
        return multiplier * index;
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 4));
        System.out.println(multiply(3, 4));
    }
}
