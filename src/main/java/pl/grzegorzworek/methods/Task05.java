package pl.grzegorzworek.methods;

public class Task05 {
    // first option
    public static boolean checkMaturity(int age){
        if (age >= 18){
            return true;
        } else return false;
    }

    // second option

    public static boolean checkMaturityTwo(int age){
        return age >=18;
    }

    public static void main(String[] args) {
        System.out.println(checkMaturity(22));
        System.out.println(checkMaturity(10));
    }
}
