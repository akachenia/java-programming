package practice_replit;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class PlusMethod {
    public static void main(String[] args) {
        plus();
    }

    // Do not touch above

    public static void plus() {

        //your code here
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("enter first number: " + num);
        System.out.println("enter second number: " + num2);
        int result = num + num2;

        System.out.println("result: " + result);
    }
}

/*
Implement the plus method. The return is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */