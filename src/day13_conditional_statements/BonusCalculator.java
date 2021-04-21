package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        //bonus =0;
        //salesAmount = 2000.55;
        //if salesAmount <= 1000;
        //"good job, you qualified for bonus!"
        //assign $50 to bonus;
        //else
        //'Great job, you are qualified for full bonus"
        //assign $100 to bonus
        //Your bonus for salesAmount is $100
        double salesAmount = 2000.55;
        double bonus = 0.0;
        if (salesAmount <= 1000) {
            System.out.println("good job, uou qualified for bonus!");
            bonus = 50;
        } else {
            System.out.println("Great job, you are qualified for full bonus");
            bonus = 100.0;
        }
        System.out.println("Your total bonus : $" + bonus);
    }
}
