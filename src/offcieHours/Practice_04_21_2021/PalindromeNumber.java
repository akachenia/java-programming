package offcieHours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(112 % 1);
        System.out.println(112 % 10);
        System.out.println(112 % 100);

        System.out.println(isPalindrome(123045));
    }

    public static boolean isPalindrome(int number){

        System.out.println(number % 10);
        while(number != 0){
            System.out.println("number % 10: " + number % 10);
            number /= 10;
            System.out.println("number /10: " +number);
            System.out.println();

        }

        return false;
    }
}
