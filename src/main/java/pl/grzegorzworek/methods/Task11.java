package pl.grzegorzworek.methods;

public class Task11 {
    public static boolean divisibleBy (int a, int b){
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(divisibleBy(4,2));
        System.out.println(divisibleBy(4,3));
    }
}
