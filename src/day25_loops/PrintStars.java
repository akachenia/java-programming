package day25_loops;

public class PrintStars {
    public static void main(String[] args) {
        for(int stars = 1; stars <= 15; stars++){
            System.out.print("* ");
        }
        System.out.println();
        String myStars = "";
        //fill 5 stars to myStars variable.

        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        myStars += "* ";
        System.out.println("my stars = " + myStars.trim());
        for(int i = 1; i <= 5; i ++ ){
           // myStars = myStars +"* "
            myStars += "* ";
        }
        System.out.println("my stars = " + myStars.trim());
    }
}
