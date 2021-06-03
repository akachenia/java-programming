package InterviewPractising;

import java.util.Arrays;

public class practice1 {

    public static void main(String[] args) {
        String word = "Aizat";
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--){
            reverse += word.charAt(i);


        }
        System.out.println(reverse);


        String word1 = "Akachenya";
        String reverse1 = "";

        char [] word2 = word1.toCharArray();

        for (int i = word2.length-1; i >=0; i--){
            reverse1 += word2[i];
        }
        System.out.println(reverse1);
    }
}
