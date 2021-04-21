package day36_methods_with_return;
import java.util.*;
public class info {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full name = " + fullName());
        isMarried();
        System.out.println("isMarried = " + isMarried());
        getAge();
        System.out.println("age = " + getAge());
        System.out.println("Random year: " + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);

        if(isMarried()){
            System.out.println("married");
        }else{
            System.out.println("single");
        }

    }
    public static String fullName(){
        return  "Mike Smith";
    }

    public static boolean isMarried(){
        return true;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }

}
