package Day41_arrayList;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
//declare Arraylist . alt/option + enter
        ArrayList<String> cities = new ArrayList<>();
        //add cities to arraylist -> add methods
        cities.add("Washington DC"); // 0 index
        cities.add("New York"); // 1
        cities.add("Vienna");// 2
        cities.add("Adana");//3
        cities.add("LA");//4
        // add Ashgabt to 0 index
        cities.add(0, "Ashgabat"); // overloading method the same name different parametr
        System.out.println(cities);

        // How to print first and last city
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));

        // we can also use size (-) methods
        System.out.println("last city = " + cities.get(cities.size()-1));


        //print count of items in arraylist
        System.out.println("count of items = " + cities.size());

        int size = cities.size();
        System.out.println("size = " + size);

        //for loop and print all values in same line
        for(int i = 0; i < cities.size(); i++){

            System.out.print(cities.get(i)+" ");
        }
        // for ech loop
        System.out.println();
        for ( String city : cities ){
            System.out.print(city +" ");
        }
        System.out.println();
        //delete item from arraylist

      cities.remove(3); // 1) remove using index . delete value at index 3

        cities.remove("New York"); //2) remove using obejct/value


        System.out.println("after remove = " + cities);

        // delete/remove all values from list
        cities.clear();

        // make sure it is clear
        //1) print|spit it out
        System.out.println("cities = " + cities);
        //2) using is empty
        if (cities.isEmpty()){
            System.out.println("list is empty");
        //3) check size() == 0;
        if (cities.size() == 0){
            System.out.println("List is empty");
        }
        }
    }
}
