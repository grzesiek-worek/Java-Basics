package pl.grzegorzworek.arrays;

public class Task07 {
    public static boolean contains(int[] arr, int element){
        boolean resCont = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element){
                resCont = true;
            }
        }
        return resCont;
    }
    public static void main(String[] args) {

        int element = 5;
        int [] arr = {1,2,3,4,5};

        System.out.print(contains(arr,element));

    }
}