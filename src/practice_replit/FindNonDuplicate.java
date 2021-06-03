package practice_replit;
import java.util.*;
public class FindNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt()};

     //   int uniq = 0;
        for(int i = 0; i <nums.length; i++){
        int count = 0;

            for(int each : nums){
                if(each == nums[i]){
                    count++;

                }
            }
            if(count == 1){
                System.out.println(nums[i]);
            }

        }
    }
}