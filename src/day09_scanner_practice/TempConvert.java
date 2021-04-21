package day09_scanner_practice;
import java.util.Scanner;
public class TempConvert {
        public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);
            System.out.println("#### F to C converter program ####");
            System.out.println("Enter F value:");
            double fValue = scan.nextDouble();
            double cValue = (fValue -32 )* 5 / 9;
            System.out.println(cValue);
        }
        }



