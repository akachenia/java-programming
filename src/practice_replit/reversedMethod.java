package practice_replit;
import java.util.Scanner;

public class reversedMethod {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(reverseNoSpec(in.next()));

    }

    public static String reverseNoSpec(String str) {

        // your code here
        int k =0;
        char[] a = str.toCharArray();
        for (int i = 0; i <= a.length/2 ; i++) {

            if(a[i] >= 'a' && a[i] <= 'z' || a[i] <= 'Z' && a[i] >='A') {
                for (int j = a.length - 1 -k; j >= a.length/2  ; j--) {
                    if (a[j] >= 'a' && a[j] <= 'z' || a[j] <= 'Z' && a[j] >= 'A') {
                        char tem = a[i];
                        a[i] = a[j];
                        a[j] = tem;
                        k = a.length-j;
                        break;
                    }
                }
            }

        }
        String revers = "";
        for (char each: a ) {
            revers+=each;
        }








        return revers;
    }


}
