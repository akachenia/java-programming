package day12_conditional_statements;
import java.util.Scanner;
//import scanner
//create scanner object
//ask "Enter total price"

//assign value to totalPrice from scan.nextDouble.
//if totalPrice is more that or equal to 25
// print "Free Shipping Eligible. Your order total:$55"
//Else
//print "Not Eligible For Free Shipping. Your order total is $10.
//less than minimum of$25"
public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price: ");

        double totalPrice = scan.nextDouble();

        if(totalPrice >=25.0){
            System.out.println("Free shipping eligible. Your order total: $" + totalPrice);
        }else{
            System.out.println("Not eligible for free shipping. Your order total: $" + totalPrice);
        }
        System.out.println("thanks for shopping amazon!");

    }
}
