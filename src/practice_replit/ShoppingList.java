package practice_replit;
import java.util.Scanner;
//-Declare 4 String variables item1, item2, item3, report.
//-Declare double variables price1, price2, price3, totalPrice
//-Create a Scanner object named scan.
//Example:
//Enter Item1 and its price:
//Tomatoes
//5.5
//"Enter Item2 and its price:
//Cheese
//3.5
//Enter Item3 and its price:
//Apples
//6.3
//
//Output:
//Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//Total price: 15.3
public class ShoppingList {
    public static void main(String[] args) {
        System.out.println("Shopping list");
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter item1 for tomatoes:");
        double item1 = scan.nextDouble();
        System.out.println("Enter item2 for cheese:");
        double item2 = scan.nextDouble();
        System.out.println("Enter item3 for apples:");
        double item3 = scan.nextDouble();
        double total = item1 +item2+item3;
        System.out.println("Total is " + total);
    }
}
