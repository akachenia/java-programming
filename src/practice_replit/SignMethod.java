package practice_replit;

import java.util.Scanner;
public class SignMethod {


        public static void sign(int n){
      if(n < 0){
          System.out.println("negative");
      }else if(n > 0){
                System.out.println("positive");
            }else{
          System.out.println("zero");
      }



        }

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            int n = inp.nextInt();

            sign(n);

        }
    }

