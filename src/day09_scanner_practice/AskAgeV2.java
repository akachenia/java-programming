package day09_scanner_practice;

import java.util.Scanner;
// print "How old are you?"
//age -> System input scan.nextInt();
//print "age - thats great age!'
public class AskAgeV2 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in); // Scanner is non-primitive, object type, class type.
                                                //Scanner is class name
                                                // new -> create new object from a class;
        System.out.println("How old are you");

        String age = scan.next();
        System.out.println(age + " - thats great age");


    }
}
