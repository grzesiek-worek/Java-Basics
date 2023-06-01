package pl.grzegorzworek.arrays;

public class Task08 {
    public static int[] append(int[] arr){
        int newLengthArr = arr.length*2;
        int arrTmp[] = new int[newLengthArr];
        int position = 0;
        int j = arr.length-1;

        for (int i=0; i < arr.length; i++){
            arrTmp[position] = arr[i];
            position++;
        }

        for (int i=0; i < arr.length; i++){
            arrTmp[position] = arr[j];
            position++;
            j--;
        }

        return arrTmp;
    }
    public static void main(String[] args) {
        int [] inputArr = {1,2,3};
        int [] returnArr = append(inputArr);

        for (int i = 0; i < returnArr.length; i++){
            System.out.print(returnArr[i] + ", ");
        }
    }
}
