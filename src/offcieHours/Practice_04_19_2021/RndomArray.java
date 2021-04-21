package offcieHours.Practice_04_19_2021;

import java.util.Arrays;
import java.util.Random;

public class RndomArray {
    public static void main(String[] args) {
        int[] a = getRandomIntArray(10,500);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(getRandomIntArray(10,500)));
    }

    public static int[] getRandomIntArray(int size, int maxRandomNumber){

        Random random = new Random();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(maxRandomNumber);
        }

        return arr;
    }
}
