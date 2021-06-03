package InterviewPractising;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String word = "Aizat";
        String reverse = "";
//
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println(reverse);


        String word1 = "Akachenya";
        String reverse2 = "";

        char[] word2 = word1.toCharArray();

        System.out.println(Arrays.toString(word2));

        for(int i = word2.length-1; i >= 0; i--){
            reverse2 += word2[i];
        }
        System.out.println(reverse2);



    }

}
