package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        //check if age is not more then 5. print "Need to sit in child car seat".
        if(!(age>7)){
            System.out.println("need car seat");
        }else{
            System.out.println("no need car seat");

        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit");
        }
        boolean isAffordable = true;
        //if its not affordable then print "Item not affordable".

        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }
        String carModel = "Tesla";
        //if its not tesla, print "Not interested"
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested, thank you");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword is not equals inputPassword: print "Incorrect Password"
        if(!inputPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Incorrect password");

        }
        if (inputPassword.equals("abc123")){
            System.out.println("Correct password");
        }else{
            System.out.println("In correct password");
        }
    }
}
