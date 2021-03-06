package day40_arraylist;
import java.util.*;

public class ArrayListMethods {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        System.out.println("size = " + shoppingList.size());
        System.out.println("isEmpty? = " + shoppingList.isEmpty());

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("list is not empty, code java then go to mall");
        }

        shoppingList.add("Shoes");
        shoppingList.add("cheap monitor");
        shoppingList.add("mask");
        shoppingList.add("wooden spoon");
        shoppingList.add("scooter");
        shoppingList.add("java book");
        shoppingList.add("tesla");

        if (shoppingList.isEmpty()) {
            System.out.println("List is empty, keep coding java");
        } else {
            System.out.println("list is not empty, code java then go to mall");
        }

        int count = shoppingList.size();
        System.out.println("items to buy = " + count);

        System.out.println("is shoes in my list? " + shoppingList.contains("Shoes"));
        if (shoppingList.contains("Shoes")) {
            System.out.println("Shoes is in the list");
        } else {
            System.out.println("Shoes is not in the list");
        }

        System.out.println("Buying shoes ... $80");

       // shoppingList.remove(0);
        //System.out.println(shoppingList);
        shoppingList.remove("Shoes");
        System.out.println("List = " + shoppingList);

        System.out.println("Done shopping, get back to coding");
        shoppingList.clear(); // clear the list, remove all items
        System.out.println(shoppingList);

    }
}