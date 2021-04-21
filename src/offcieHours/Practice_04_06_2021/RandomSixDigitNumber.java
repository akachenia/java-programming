package offcieHours.Practice_04_06_2021;
import java.util.Random;
import java.util.Scanner;
public class RandomSixDigitNumber {
    public static void main(String[] args) {
        Random random = new Random();
        String randomNumber = "";
        while(randomNumber.length() != 6){
            int eachRandom = random.nextInt(10);
            if(!randomNumber.contains("" + eachRandom)){
                randomNumber += eachRandom;
            }
        }

        System.out.println("Random Number: " + randomNumber);

    }
}
