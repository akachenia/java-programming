package day35_methods_with_param;
import java.util.*;

public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 doubles:");
        double d1 = scan.nextDouble();
        double d2 = scan.nextDouble();

        ShowSum(d1, d2);
        ShowSum(5,6);

    }
    public static void ShowSum(double num1, double num2){
        System.out.println(num1+num2);
    }
}
