package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversation {
    public static void main(String[] args){
        String word = "CyberTek";
        String sentence = "Java IS Fun!";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());
        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLCase = " + word);
        word = word.toLowerCase();
        System.out.println("word = " + word);
        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " + company.toUpperCase());
        System.out.println("java".toUpperCase());
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}
