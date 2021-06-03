package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {

    /*
    MethodName: printStrList
    param: List of Strings
    return: void
    prints all value separated by space in same line
     */

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input");
        words.add("title");
        // pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("selected", "option", "br", "python", "sql", "api"));

        List<Integer> nums = Arrays.asList(23, 54, 23, 5456, 234, 11, 5, 2);
       int sum =  sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }


    public static void printStrList(List<String> stringList){ //"java", "apple", "coffee"
        for (String str :stringList){
            System.out.print(str +" ");
        }
        System.out.println();
    }

/**
 * method : sumIntegerList
 * param: List of Integers
 * returns int calculates sum of integers in the list then returns
 *
 */                                             //press control and space give u optin
     static int sumIntegerList(List<Integer>list){
    int sum = 0;

    for (int i : list){
        sum += i;
    }
    return sum;
    }
}