package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String firstName = "Akachenya";
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("both a && e are present");
        }else{
            System.out.println("a || e not present");
        }
        firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("a or i is present");
        }else{
            System.out.println("not a or i is present");
        }
        String email = "akachenia@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("Valid email");

        }else{
            System.out.println("invalid");
        }
        if(email.toLowerCase().contains("d")){
            System.out.println("d is present");
        }else{
            System.out.println("d is not present");
        }
    }
}
