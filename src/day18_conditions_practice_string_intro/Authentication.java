package day18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args){
     int expLast4SSN = 1234;
     int expPinCode = 4321;

     int Last4SSN = 1234;
     int PinCode = 1111;
     if(Last4SSN == expLast4SSN && PinCode == expPinCode){
         System.out.println("Authentication successful");
     }else{
         System.out.println("Authentication unsuccessful");
         if(Last4SSN != expLast4SSN){
             System.out.println("Last 4 SSN number is incorrect");
         }
        if(expPinCode != PinCode){
            System.out.println("Pin Code is incoreect");
        }
     }
    }
}
