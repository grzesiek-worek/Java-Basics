package pl.grzegorzworek.exceptions;

public class Task06 {
    public static String safeGet(String[] strTab, int index){
        return strTab[index];
    }
    public static void main(String[] args) {
        String[] myTab = {"Alfa","Bravo","Charlie"};
        try {
            System.out.println(safeGet(myTab,1));
            System.out.println(safeGet(myTab,5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
