package day36_methods_with_return;

import java.sql.SQLOutput;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(700);
        //system.out.println(checkEligible(711)); ERRor - cannot print void method
        System.out.println("Score: " + getCreditScore());
        int score = getCreditScore();
        System.out.println("CreditScore = " + getCreditScore());

    }
    public static void checkEligible(int creditScore){
        if(creditScore >= 700){
            System.out.println("You are eligible for leasing this car");
        }else{
            System.out.println("You are not eligible for leasing this car");
        }
    }
     public static int getCreditScore(){
        return 800;
     }
}
