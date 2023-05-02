package pl.grzegorzworek.arrays;

public class Task01 {
    public static void main(String[] args) {

        int[] mainTab = new int[50];

        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
        }

        for (int i = 0; i < 5 ; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.printf("%02d, ", mainTab[i * 10 + j]);
            }
            System.out.println("");
        }
    }
}
