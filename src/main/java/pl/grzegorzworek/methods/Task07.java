package pl.grzegorzworek.methods;

public class Task07 {

    // first option
    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    // second option
    public static int maxNumber(int a, int b, int c) {
        int[] array = {a, b, c};
        int max = array[0];
        for (int i = 0 ; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxOfThree(40, -300, 30));
        System.out.println(maxNumber(-10, -305, -30));
    }
}
