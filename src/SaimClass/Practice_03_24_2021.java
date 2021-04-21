package SaimClass;

public class Practice_03_24_2021 {
    public static void main(String[] args){
        String accountNumber = "500000";
        if(accountNumber.startsWith("2")){
            if(accountNumber.length()==7){
                System.out.println("valid 2 digit account number");
            }else{
                System.out.println("Not a valid 2 digit account number");
            }

        }else if(accountNumber.startsWith("5")){
            if(accountNumber.length()==10){
                System.out.println("valid 10 digit account number");
            }else{
                System.out.println("Not a valid 10 digit account number");
            }
        }else{
            System.out.println("Not a valid account number");
        }
    }
}
