package InterviewPractising;

public class palindrome1 {
    public static void main(String[] args) {
        int num = 12321;
        int reverse = 0;

        int temp = num; // we need to create temperary variable to help us reverse it from back to start
        while (temp!=0){
            int lastdigit = temp % 10; // this formula will help us to found the last figit of the number and then to count from this
            // we found the last digit - 3
            reverse = (reverse *10) + lastdigit; // this formula will help us not to get sum of the number ,
            // instead to get the next number
            // we will get next number as is 4.

            temp = temp / 10; // this formula will help us to finish the process of the loop


        }
        System.out.println(num == reverse);
    }
}


//int a=12321;
//        int reverse=0;
//        int temp=a;
//        while (temp!=0){
//            int lastDigit=temp%10;       //1
//            reverse=(reverse10)+lastDigit;     //12
//            //010=0+1=1
//            //110=10+2=12
//            //1210=120+3=123
//            //12310=1230+2=1232
//            //123210=12320+1=12321
//            temp=temp/10;
//            //12321
//            //1232
//            //123
//            //12
//            //1
//
//        }
//        System.out.println(reverse==a);
//    }
//
//}