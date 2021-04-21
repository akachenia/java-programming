package day19_class_vs_object_strings;

import java.util.Locale;

public class StringLength {
    public static void main (String [] args){
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " + word.length());
        System.out.println("wooden spoon".length());
        String firstName = "Nadir";
        System.out.println(firstName + "-" + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);

        String password = "hello";
        //** If Statement :
        //WHEN password is at least 6 characters:
        //print: valid amazon password
        //else
        //print
        if(password.length()>=6){
            System.out.println("valid amazon password");
        }else{
            System.out.println("password too short");
        }
        }
    }

