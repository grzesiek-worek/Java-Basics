package pl.grzegorzworek.examples;

public class SwitchCase {
    public static void main(String[] args) {
        int dayOfWeek = 2;
        String dayOfWeekString;

        switch (dayOfWeek) {
            case 1:
                dayOfWeekString = "Monday";
                break;
            case 2:
                dayOfWeekString = "Tuesday";
                break;
            case 3:
                dayOfWeekString = "Wednesday";
                break;
            default:
                dayOfWeekString = "Invalid";
                break;
        }
        System.out.println(dayOfWeekString);

        String rating = "B";
        int points;

        switch (rating) {
            case "A":
                points = 60;
                break;
            case "B":
                points = 50;
                break;
            case "C":
                points = 40;
                break;
            default:
                points = 1;
                break;
        }

        System.out.println("Your score is: " + points);
    }
}
