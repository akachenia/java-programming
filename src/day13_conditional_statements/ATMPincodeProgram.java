package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        //secretPinCode
        //inputPincode
        //"Welcome to your account." true
        //"you can withdraw, check balance, deposit"

        //false: "Incorrect pincode! 1234
        //"Please try again."
        // print "Thank you for using TD Bank ATM!"
        System.out.println(" ****  Welcome to TD BANK ATM ****");
        int secretPincode = 2293;
        int inputPincode = 2233;

        if ( secretPincode == inputPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, deposit");
        }else {
            System.out.println("Incorrect pincode! " + inputPincode);
            System.out.println("Please try again!");
        }
        System.out.println("Thank you for using TD Bank ATM!");

    }
}
