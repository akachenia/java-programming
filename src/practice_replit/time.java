package practice_replit;
import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        int hour = 12;
        int minute = 24;
        int second = 33;
        Scanner sc = new Scanner(System.in);
        hour = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        String amOrPm = sc.next();
        System.out.println(hour + ":" + minute + ":" + second  + " pm");
    }

}
