package day09_scanner_practice;
import java.util.Scanner;
//import scanner
//create scanner object
//Target
// milk, bread, cucumber
//Flow:
//enter price for milk: 3.99;
// enter price for bread: 2.5;
//enter price for cucumbers: 4.10
//Total is $10.59
//price1, price2, price3,total
public class GroceryShopping {
    public static void main(String[] args) {
        System.out.println("Target");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter price for milk:");
        double price1 = scan.nextDouble();
        System.out.println("Enter price for bread:");
        double price2 = scan.nextDouble();
        System.out.println("Enter price for cucmbers:");
        double price3 = scan.nextDouble();
        double total = price1 +price2+price3;
        System.out.println("Total is " + total);





    }
}
