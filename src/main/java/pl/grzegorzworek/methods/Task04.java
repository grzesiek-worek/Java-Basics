package pl.grzegorzworek.methods;

public class Task04 {

    public static String createName(String name, String surname, String nickname){
        return name + " " + nickname + " " + surname;
    }

    public static String createNameTwo(String name, String surname, String nickname){
        return String.format("%s %s %s", name, nickname, surname);
    }

    public static void main(String[] args) {
        System.out.println(createName("John", "Wick", "Wicky"));
        System.out.println(createNameTwo("Math", "Way", "Rider"));

        System.out.println(createName("Nicole", "Murphy", "Emma"));
    }
}
