package pl.grzegorzworek.methods;

public class Task02 {

    // first option
    public static int square(int num){
        return num * num;
    }

    // second option
    public static int squareTwo(int num){
        return (int) Math.pow(num, 2);
    }

    public static void main(String[] args) {
        System.out.println(square(4));
        System.out.println(squareTwo(4));
    }
}
