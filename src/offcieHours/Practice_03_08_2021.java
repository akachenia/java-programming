package offcieHours;
import java.util.Scanner;
public class Practice_03_08_2021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your length:");
        double lenth = scan.nextDouble();
        System.out.println("Enter your width:");
        double width = scan.nextDouble();


        double perimetr = 2 * (lenth + width);
        double area = lenth * width;

        System.out.println("perimetr = " + perimetr);
        System.out.println("area = " + area);
    }
}
