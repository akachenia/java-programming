package practice_replit;

public class Swap {

    public static void main(String[] args) {
        //Swap values of two variables (with/without extra variable)
        int j = 15;
        int i = 10;
        int temp = 0;

        temp = j;
        j = i;
        i = temp;
        System.out.println("Value of first number " + j);
        System.out.println("Value of second number " + i);
    }
}
