package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location, salary, remote, hasBenefits
    // add if statements with && operator to decide to accept job offer or no
        String location = "California";
        boolean isRemote = true;
        boolean hasBenefits = false;
        double salary = 120_000.0;
        if(location.equals ("California") && isRemote && hasBenefits && salary >=120_000.0){
            System.out.println("I will take this offer");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }
    }
}
