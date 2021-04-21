package practice_replit;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ShoppingListLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;

        do{
            System.out.println("Enter item " + count + " and its price");
            item = scan.next();
            price = scan.nextDouble();

            System.out.println("Add one more item?");
            countinue = scan.next();
            if(countinue.equals("yes"));
            shoppingListReport += "Item " + count + ":" + item + " Price:" + price + ", ";
            count++;
            totalPrice += price;

        }while(count<=10 && countinue.equals("yes"));

        System.out.println(shoppingListReport);
        System.out.println("Total price " + totalPrice);

    }

}










