package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry) {
            System.out.println("I am hungry i will go get something to eat");
        } else {
            System.out.println("I am not hungry, Lets keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200.0;
        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println(" I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = true;
        if (isRemoteJob) {
            System.out.println("Sorry i am not interested");
        } else {
            System.out.println("Sure i am interested, what is the interview process?");
        }


        }

}