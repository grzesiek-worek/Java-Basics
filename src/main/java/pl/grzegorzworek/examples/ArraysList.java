package pl.grzegorzworek.examples;

import java.util.ArrayList;
import java.util.List;

public class ArraysList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Bravo");
        list.add("Charlie");
        list.set(2,"Charlie 3");

        for (String element: list){
            System.out.println(element);
        }

        System.out.println(list.size());
        list.remove("Bravo");
        System.out.println(list);

    }

}
