package InterviewPractising;

public class Palindrome {

    public static void main(String[] args) {

        int num = 2442;
        int temp = num; // i need temp variable, to keep my num save, my temp variable will be as a condition, if i will work with num i  will get 0 in the end
        int reversed = 0;
        int remainder = 0; // remainder will be the number where i can use % if remainder == 0, its equal, if not



        while(temp!= 0){ // i need this because we need to run it till temp will be equal 0

            remainder = temp % 10; // remainder is the last digit of the number

            reversed = reversed * 10 + remainder;

            temp = temp / 10; //

        }

        if(reversed == num){
            System.out.println("Palindrome");
        }else{
            System.out.println("No palindrome");
        }

    }
}