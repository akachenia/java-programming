package day28_loops;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPRSTUVWXYZabcdefghijklmnoprstuvwxyz0123456789_!@#$%^&*";
        Random random = new Random();
        String password = "";

        for(int i = 1; i<= 8; i++){
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));
         //source.substring(index, index +1;
         // add
        // password = password + source.charAt(index);
        password += source.charAt(index);
        }

        System.out.println("\nYour password = " + password);

    }
}
