package offcieHours;
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the lenth of the movie");
        double movieLength = input.nextDouble();
        double price = 0;

        if(movieLength == 1){
            price = 8.99;

        }
            // = assigment
            //== compare
        if(movieLength==1.5){
            price = 10.50;
        }
        System.out.println("Price: " + price);

        if(movieLength ==2.0) {
            System.out.println("Price: " + 12.99);
        }
        if(movieLength ==2.5);{
            System.out.println("Price: " + 14.50);
        }
        if(movieLength>=3.0);
        System.out.println("Price " + 15.99);

    }
}
