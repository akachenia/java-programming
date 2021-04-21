package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2025;
        if( year == 2020){
            System.out.println("covid19 pandemic year");
            System.out.println("Wear mask and keep distance");
        }
        //check year equals 2020
        //print "covid19 pandemic year"
        //print "wear mask and keep distance"
        System.out.println("keep coding java");
        String country = "USA";
        if (country.equals ("USA")) {
            System.out.println("washington DC is the capital");
            System.out.println("white house is on Pennsylvania ave");

        }
        System.out.println("welcome to " + country);
    }
}
