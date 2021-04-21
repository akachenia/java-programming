package practice_replit;

import java.sql.SQLOutput;
import java.util.Scanner;
public class LoopsJava {
//javaxjava
//012345678
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";
        int count = 0;

        for(int i = 0; i<word.length()/2; i++ ){
            result+= word.substring(word.length()/2+1) +word.substring(word.length()/2+1);
        }
        if(result.equals("java"));
        count++;
        System.out.println(result);
    }

    }

//while(pos!=-1){
//   count++;
//   str = str.substring(pos+2);
//   pos = str.indexOf("hi");
