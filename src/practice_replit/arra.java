package practice_replit;
import java.util.*;
public class arra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count = 0;

        for(int i = 0; i< nums.length; i++){
            if(nums[i]%2==0){
                count++;
            }
        }
        System.out.println("Even = " + count);

            }
        }




//Given an array nums, count and print the number of even numbers in the array
//
//Examples:
//
//nums → [2, 1, 2, 3, 4]) → 3
//
//nums → [2, 2, 0, 3, 5]) → 3
//
//nums → [1, 3, 5, 7, 9]) → 0