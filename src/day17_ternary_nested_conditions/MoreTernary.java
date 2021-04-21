package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        //hourly rate = 50;
        //when hourlyRate > 45
        //reply = "accept"
        //otherwise
        //reply = "reject"

        int hourlyRate = 50;
        String reply = (hourlyRate >45) ?"Accept" : "Reject";
        System.out.println("reply = " + reply);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Saim|Murodil" : "Nodir";
        System.out.println("today's teacher = " +teacher);

        boolean isEligibleToDrive = true;
         // "have DL and Can Drive". "No DL, cannot drive"
        String driving = isEligibleToDrive ? "yes, have DL, Can drive" : "no DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}
