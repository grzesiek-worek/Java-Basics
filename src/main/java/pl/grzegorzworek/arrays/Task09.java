package pl.grzegorzworek.arrays;

import java.util.Arrays;

public class Task09 {

    public static int[] returnUnique(int [] arr){
        int uniqueArr[] = Arrays.stream(arr).distinct().toArray();
        return uniqueArr;
    }
    public static void main(String[] args) {
        int [] inputArr = {1,1,2,3,3,4};
        int [] returnArr = returnUnique(inputArr);

        for (int i = 0; i < returnArr.length; i++){
            System.out.print(returnArr[i] +", ");
        }
    }
}
