package pl.grzegorzworek.examples;

public class IfElse {
    public static void main(String[] args) {
        int age = 35;

        if (age > 18 && age < 35){
            System.out.println("You are legal age");
        } else if (age >= 35) {
            System.out.println("aYou can run for president of the Republic of Poland");
        } else if (age > 15) {
            System.out.println("You can go to high school");
        } else {
            System.out.println("You are underage");
        }

        String name = "Mark";

        if (name.equals("Tom")){
            System.out.println("Hi Tom!");
        } else if (name.equals("Mark")) {
            System.out.println("Hi Mark");
        } else if (name.equals("Anna")) {
            System.out.println("Hi Anna!");
        } else {
            System.out.println("Hi!");
        }
    }
}
