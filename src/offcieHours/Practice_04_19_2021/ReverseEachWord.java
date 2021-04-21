package offcieHours.Practice_04_19_2021;

import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));

    }

    public static String reverseEachWord(String str){

        String reverse = "";

        for(String each : str.split(" ")){
            reverse += StringUtils.reverse(each) + " ";
            //String eachReverse = "";
            //Here we would reverse each String with a for loop
            //going from the last index to the first index


        }
        return reverse;
    }
}
