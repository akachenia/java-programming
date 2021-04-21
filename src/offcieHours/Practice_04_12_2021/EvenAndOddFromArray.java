package offcieHours.Practice_04_12_2021;

public class EvenAndOddFromArray {
    public static void main(String[] args) {
        int[] nums = {4,1,3,12,5};
        int even = 0;
        int odd = 0;

        for(int eachNum : nums){
            if(eachNum % 2 ==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }



    }


