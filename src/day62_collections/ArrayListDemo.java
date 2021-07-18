package day62_collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<String> cities = new ArrayList<>();//polymorphism
        Collection<String> schools = new ArrayList<>(); //polymorphism


        cities.add("McLean");
        cities.add("Vienna");
        cities.add("New York");

        System.out.println(cities);
        System.out.println("first city: " + cities.get(0));
        System.out.println("Count of cities = " + cities.size());

    }
}
