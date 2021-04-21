package day09_scanner_practice;
// cents  -> 123
//dollars -> 1
//remainingCents ->23
//print:
//in 123 cents: 1 dollars 23 cents
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter cents: ");
        int cents = scan.nextInt(); // int cents = 255;
        int dollars = cents / 100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollars = " + dollars);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("In " +cents+" cents : "+dollars+" dollars " +remainingCents+" cents");


    }
}
