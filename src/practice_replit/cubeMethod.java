package practice_replit;

import java.util.Scanner;
    class Main {
        public static void main(String[] args) {


            cube();
        }

        //end cube



           public static void cube(){
               Scanner scan = new Scanner(System.in);
               int n = scan.nextInt();
               int num = 5;
               System.out.println(n*n*n);

           }

        }




/*
Create a method called cube. It is a void method with no arguments.
 Write all required code inside this method in order to read a number from the console and then prints the cubed value of that number:

Example:

input: 5

output: 125
input: 5

output: 125
hint: cube of a number n = n^3 ->

n * n * n
 */