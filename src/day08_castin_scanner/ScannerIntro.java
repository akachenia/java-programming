package day08_castin_scanner;
//Steps to use scanner class:
//1) type on top of class: we need import Scanner class into our class.
//2) Create Scanner Object using New keyword
//3) Ask a question:
//System.out.println ("Please enter your name;")
//4) Capture the typed keyword input value into variable


import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String firstName = scan.next();
        System.out.println("nice to meet you, " + firstName);





    }
}
