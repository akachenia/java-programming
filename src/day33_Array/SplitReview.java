package day33_Array;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length;
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        System.out.println("-----Split With Empty String-----");
        String[] strArr = word.split("");
        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);
        System.out.println(strArr[3]);

        String word2 = "java1sql2html";
        String[] strArr2 = word2.split("\\d");
        System.out.println(Arrays.toString(strArr2));

        word2 = word2.replaceAll("\\d", "_");
        System.out.println("word2 = " + word2);

        String password = "Abcd123_5";
      //  if(password.matches())



    }
}
