package pl.grzegorzworek.examples;

public class Methods {
    public static void sayHello(){
        System.out.println("Hello, I'm Grzegorz");
        int age = 40;

        System.out.println("I'm " + age + " years old but feel like " + (age / 2));
    }

    public static String greeting(){
        String greeting = "Hello Grzegorz";
        return greeting;
    }

    public static int calculateBaseAge(){
        int baseAge = 10;
        return baseAge * 4;
    }

    public static void printName(String name){
        System.out.println("Hello, my name is " + name);
    }

    public static void calculateAge(int baseAge, int additionalAge){
        int result = baseAge + additionalAge;
        System.out.println("My age is..... " + result);
    }

    public static int calculateTemperature(int baseTemp, int factor){
        int result = baseTemp * factor;
        return result;
    }

    public static void main(String[] args) {
        sayHello();
        String hello =  greeting();
        System.out.println(hello);

        System.out.println(greeting());

        int baseAge = calculateBaseAge();

        int myAge = baseAge + 5;

        System.out.println("My age is " + myAge);


        printName("Anna");

        String myName = "Mark";

        printName(myName);

        calculateAge(25, 10);

        int temperature = calculateTemperature(13, 2);

        System.out.println("Today's temperature is " + temperature);
    }
}
